package com.amit.ScheduledExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.amit.TaskList.TaskList;

public class ScheduledExecutorsClient {

	public static void main(String[] args) {
		
		/**
	     * Creates a thread pool that can schedule commands to run after a
	     * given delay, or to execute periodically.
	     * @param corePoolSize the number of threads to keep in the pool,
	     * even if they are idle
	     * @return a newly created scheduled thread pool
	     * @throws IllegalArgumentException if {@code corePoolSize < 0}
	     */

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		TaskList task = new TaskList();
		
		/**
	     * Creates and executes a one-shot action that becomes enabled
	     * after the given delay.
	     *
	     * @param command the task to execute
	     * @param delay the time from now to delay execution
	     * @param unit the time unit of the delay parameter
	     * @return a ScheduledFuture representing pending completion of
	     *         the task and whose {@code get()} method will return
	     *         {@code null} upon completion
	     * @throws RejectedExecutionException if the task cannot be
	     *         scheduled for execution
	     * @throws NullPointerException if command is null
	     */
		scheduledExecutorService.schedule(task, 10, TimeUnit.SECONDS);
		
		scheduledExecutorService.shutdown();
	}

}