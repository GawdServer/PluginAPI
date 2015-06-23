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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class PluginQueue {
	private static ExecutorService queue;

	public static void submit(Runnable task) {
		queue.submit(task);
	}

	public static void shutdown() {
		queue.shutdown();
	}

	public static void awaitTermination(long time, TimeUnit unit) throws InterruptedException {
		queue.awaitTermination(time, unit);
	}

	public static void setQueue(ExecutorService executorService) {
		queue = executorService;
	}
}
