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
package io.github.gawdserver.api.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vinnie on 2/2/2015.
 */
public class PlayerList {
    private static final HashMap<String, String> playerIDs = new HashMap<>();
    private static final ArrayList<String> onlinePlayers = new ArrayList<>();

    public static void addPlayerID(String username, String uuid) {
        playerIDs.put(username, uuid);
    }

    public static void playerLogin(String username) {
        onlinePlayers.add(username);
    }

    public static void playerLogout(String username) {
        onlinePlayers.remove(username);
    }

    public static String getUsername(String uuid) {
        for (Map.Entry<String, String> entry : playerIDs.entrySet()) {
            if (uuid.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static String getUUID(String username) {
        return playerIDs.get(username);
    }

    public static ArrayList<String> getOnlinePlayers() {
        return onlinePlayers;
    }

    public static int onlinePlayers() {
        return onlinePlayers.size();
    }
}
