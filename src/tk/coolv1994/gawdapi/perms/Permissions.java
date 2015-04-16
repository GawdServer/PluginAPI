/**
 * GawdServer - A new way to serve Minecraft
 * Copyright (C) 2015  CoolV1994 <http://coolv1994.tk>
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
package tk.coolv1994.gawdapi.perms;

/**
 * Created by Vinnie on 2/2/2015.
 */
public class Permissions {
    private static PermissionManager manager;

    public static boolean hasPermission(String player, String node) {
        if (manager != null) {
            return manager.hasPermission(player, node);
        }
        return false;
    }

    public static PermissionManager getManager() {
        return manager;
    }

    public static void setManager(Class<?> permManager) {
        try {
            manager = (PermissionManager) permManager.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
