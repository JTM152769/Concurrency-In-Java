package com.amit.ScheduledExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.amit.TaskList.TaskList;

public class ScheduledExecutorsPeriodicClient {

	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		TaskList task = new TaskList();
		
		/**
	     * Creates and executes a periodic action that becomes enabled first
	     * after the given initial delay, and subsequently with the given
	     * period; that is executions will commence after
	     * {@code initialDelay} then {@code initialDelay+period}, then
	     * {@code initialDelay + 2 * period}, and so on.
	     * If any execution of the task
	     * encounters an exception, subsequent executions are suppressed.
	     * Otherwise, the task will only terminate via cancellation or
	     * termination of the executor.  If any execution of this task
	     * takes longer than its period, then subsequent executions
	     * may start late, but will not concurrently execute.
	     *
	     * @param command the task to execute
	     * @param initialDelay the time to delay first execution
	     * @param period the period between successive executions
	     * @param unit the time unit of the initialDelay and period parameters
	     * @return a ScheduledFuture representing pending completion of
	     *         the task, and whose {@code get()} method will throw an
	     *         exception upon cancellation
	     * @throws RejectedExecutionException if the task cannot be
	     *         scheduled for execution
	     * @throws NullPointerException if command is null
	     * @throws IllegalArgumentException if period less than or equal to zero
	     */
		scheduledExecutorService.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
		
		//scheduledExecutorService.shutdown();
	}

}