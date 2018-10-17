
/**
 * @author amitsah
 */
package com.amit.ExecutorsClient;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.amit.TaskList.TaskList;

public class ExecutorsClient {

	public static void main(String[] args) {
		
		/**
	     * Creates an Executor that uses a single worker thread operating
	     * off an unbounded queue. (Note however that if this single
	     * thread terminates due to a failure during execution prior to
	     * shutdown, a new one will take its place if needed to execute
	     * subsequent tasks.)  Tasks are guaranteed to execute
	     * sequentially, and no more than one task will be active at any
	     * given time. Unlike the otherwise equivalent
	     * {@code newFixedThreadPool(1)} the returned executor is
	     * guaranteed not to be reconfigurable to use additional threads.
	     *
	     * @return the newly created single-threaded Executor
	     */
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		//Anonymous class for implementation of run method
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task1 ...........");
			}
		};
		
		Runnable task2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task2.............");
			}
		};
		
		//Anonymous class for implementation of run method using Lambda Expression
		Runnable task3 = ()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Task3..............");
		};
		
		Runnable task4 = ()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Task4 ............");
		};
		
		TaskList task5 = new TaskList();
		
		//Submitting the Runnable task to thread pool
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.submit(task4);
		executorService.submit(task5);
		
		//closing the thread neither it remains active 
		executorService.shutdown();
		
	}
}