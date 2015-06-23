package io.github.gawdserver.api.plugin;

import java.io.File;

public class PluginDir {
	private static File pluginDir;

	public static File getPluginDir() {
		return pluginDir;
	}

	public static void setPluginDir(File dir) {
		pluginDir = dir;
	}
}
