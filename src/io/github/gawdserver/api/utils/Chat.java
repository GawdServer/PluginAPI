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
package io.github.gawdserver.api.utils;

import io.github.gawdserver.api.Server;
import io.github.gawdserver.api.player.Sender;

import java.util.Map;

public class Chat {
    public static void sendMessage(String username, String message) {
        if (Sender.CONSOLE.name().equals(username)) {
            System.out.println(message);
            return;
        }
        Server.sendCommand(String.format("tellraw %s {\"text\":\"%s\"}", username, message));
    }

    public static void sendMessage(String username, String message, Map<String, String> formatting) {
        if (Sender.CONSOLE.name().equals(username)) {
            System.out.println(message);
            return;
        }
        StringBuilder builder = new StringBuilder();
        builder.append("tellraw ");
        builder.append(username);
        builder.append(" {text:\"");
        builder.append(message);
        builder.append("\"");
        for (Map.Entry<String, String> entry : formatting.entrySet()) {
            builder.append(",");
            builder.append(entry.getKey());
            builder.append(":");
            builder.append(entry.getValue());
        }
        builder.append("}");
        Server.sendCommand(String.format("tellraw %s {\"text\":\"%s\"}", username, message));
    }

    public static void broadcast(String message) {
        Server.sendCommand(String.format("tellraw @a {\"text\":\"%s\"}", message));
    }

    public static String toString(String[] array) {
        if (array == null)
            return "";

        int last = array.length - 1;
        if (last == -1)
            return "";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(array[i]);
            if (i == last)
                return b.toString();
            b.append(" ");
        }
    }
}
