/**
 * GawdServer - A new way to serve Minecraft
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
package io.github.gawdserver.api.perms;

/**
 * Created by Vinnie on 2/2/2015.
 */
public class Permissions {
    private static PermissionManager manager;

    public static boolean hasPermission(String player, String node) {
        return manager != null && manager.hasPermission(player, node);
    }

    public static PermissionManager getManager() {
        return manager;
    }

    public static void setManager(PermissionManager permManager) {
        manager = permManager;
    }
}
