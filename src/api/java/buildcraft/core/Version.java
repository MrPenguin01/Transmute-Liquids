/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import net.minecraftforge.common.config.Property;

import buildcraft.BuildCraftCore;
import buildcraft.api.core.BCLog;
import buildcraft.core.proxy.CoreProxy;

public class Version implements Runnable {
	public enum EnumUpdateState {
		CURRENT, OUTDATED, CONNECTION_ERROR
	}

	public static final String VERSION = "@VERSION@";
	public static EnumUpdateState currentVersion = EnumUpdateState.CURRENT;
	public static final int FORGE_VERSION_MAJOR = 4;
	public static final int FORGE_VERSION_MINOR = 0;
	public static final int FORGE_VERSION_PATCH = 0;

	private static final String REMOTE_VERSION_FILE =
			"https://raw.githubusercontent.com/BuildCraft/BuildCraft/master/buildcraft_resources/versions.txt";

	private static final String REMOTE_CHANGELOG_ROOT =
			"https://raw.githubusercontent.com/BuildCraft/BuildCraft/master/buildcraft_resources/changelog/";

	private static String recommendedVersion;
	private static String[] cachedChangelog;

	private static Version instance = new Version();

	public static String getVersion() {
		return VERSION;
	}

	public static boolean isOutdated() {
		return currentVersion == EnumUpdateState.OUTDATED;
	}

	public static boolean needsUpdateNoticeAndMarkAsSeen() {
		if (!isOutdated()) {
			return false;
		}

		Property property = BuildCraftCore.mainConfiguration.get("vars", "version.seen", VERSION);
		property.comment = "indicates the last version the user has been informed about and will suppress further notices on it.";
		String seenVersion = property.getString();

		if (recommendedVersion == null || recommendedVersion.equals(seenVersion)) {
			return false;
		}

		property.set(recommendedVersion);
		BuildCraftCore.mainConfiguration.save();
		return true;
	}

	public static String getRecommendedVersion() {
		return recommendedVersion;
	}

	public static void versionCheck() {
		try {

			if ("0.0.0".equals(VERSION)) {
				return;
			}

			String location = REMOTE_VERSION_FILE;
			HttpURLConnection conn = null;
			while (location != null && !location.isEmpty()) {
				URL url = new URL(location);

				if (conn != null) {
					conn.disconnect();
				}

				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestProperty("User-Agent",
						"Mozilla/5.0 (Windows; U; Windows NT 6.0; ru; rv:1.9.0.11) Gecko/2009060215 Firefox/3.0.11 (.NET CLR 3.5.30729)");
				conn.connect();
				location = conn.getHeaderField("Location");
			}

			if (conn == null) {
				throw new NullPointerException();
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line;
			String mcVersion = CoreProxy.proxy.getMinecraftVersion();
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(":");
				if (mcVersion.matches(tokens[0])) {
					if (DefaultProps.MOD.matches(tokens[1])) {
						recommendedVersion = tokens[2];

						if (VERSION.matches(tokens[2])) {
							BCLog.logger.finer("Using the latest version [" + getVersion() + "] for Minecraft " + mcVersion);
							currentVersion = EnumUpdateState.CURRENT;
							return;
						}
					}
				}
			}

			BCLog.logger.warning("Using outdated version [" + VERSION + "] for Minecraft " + mcVersion
					+ ". Consider updating to " + recommendedVersion + ".");
			currentVersion = EnumUpdateState.OUTDATED;

			conn.disconnect();
			reader.close();
		} catch (Exception e) {
			BCLog.logger.warning("Unable to read from remote version authority.");
			BCLog.logger.warning(e.toString());
			currentVersion = EnumUpdateState.CONNECTION_ERROR;
		}
	}

	public static String[] getChangelog() {
		if (cachedChangelog == null) {
			cachedChangelog = grabChangelog(recommendedVersion);
		}

		return cachedChangelog;
	}

	public static String[] grabChangelog(String version) {

		try {
			String location = REMOTE_CHANGELOG_ROOT + "/" + version;
			HttpURLConnection conn = null;
			while (location != null && !location.isEmpty()) {
				URL url = new URL(location);

				if (conn != null) {
					conn.disconnect();
				}

				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestProperty("User-Agent",
						"Mozilla/5.0 (Windows; U; Windows NT 6.0; ru; rv:1.9.0.11) Gecko/2009060215 Firefox/3.0.11 (.NET CLR 3.5.30729)");
				conn.connect();
				location = conn.getHeaderField("Location");
			}

			if (conn == null) {
				throw new NullPointerException();
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line;
			ArrayList<String> changelog = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				if (line.isEmpty()) {
					continue;
				}

				changelog.add(line);
			}

			conn.disconnect();

			return changelog.toArray(new String[0]);

		} catch (Exception ex) {
			ex.printStackTrace();
			BCLog.logger.warning("Unable to read changelog from remote site.");
		}

		return new String[]{String.format("Unable to retrieve changelog for %s %s", DefaultProps.MOD, version)};
	}

	@Override
	public void run() {

		int count = 0;
		currentVersion = null;

		BCLog.logger.info("Beginning version check");

		try {
			while ((count < 3) && ((currentVersion == null) || (currentVersion == EnumUpdateState.CONNECTION_ERROR))) {
				versionCheck();
				count++;

				if (currentVersion == EnumUpdateState.CONNECTION_ERROR) {
					BCLog.logger.info("Version check attempt " + count + " failed, trying again in 10 seconds");
					Thread.sleep(10000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (currentVersion == EnumUpdateState.CONNECTION_ERROR) {
			BCLog.logger.info("Version check failed");
		}

	}

	public static void displayChangelog(ICommandSender sender) {
		int nb = 0;
		for (String updateLine : Version.getChangelog()) {
			sender.addChatMessage(new ChatComponentText("\u00A79" + updateLine));

			nb++;

			if (nb > 3) {
				sender.addChatMessage(new ChatComponentText("\u00A79[...]"));
				break;
			}
		}
	}

	public static void check() {
		new Thread(instance).start();
	}
}