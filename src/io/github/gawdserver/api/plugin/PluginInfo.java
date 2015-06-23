/**
 * GawdAPI - The GawdServer Plugin Programming Interface
 * Copyright (C) 2015  GawdServer <http://gawdserver.github.io>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.gawdserver.api.plugin;

import java.util.HashMap;

public class PluginInfo {
    private final String name;
    private final String version;
    private final String mainClass;
    // Command - Command Class
    private final HashMap<String, String> commands;
    // Event - Event Class
    private final HashMap<String, String> events;

    public PluginInfo(String name, String version, String mainClass, HashMap<String, String> commands, HashMap<String, String> events) {
        this.name = name;
        this.version = version;
        this.mainClass = mainClass;
        this.commands = commands;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getMainClass() {
        return mainClass;
    }

    public HashMap<String, String> getCommands() {
        return commands;
    }

    public HashMap<String, String> getEvents() {
        return events;
    }

    public String toString() {
        return String.format("Plugin[Name:%s, Version:%s]", name, version);
    }
}
