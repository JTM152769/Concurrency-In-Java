package com.amit.ExecutorClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClient {

	public static void main(String[] args) {
		
		/**
	     * Creates a thread pool that reuses a fixed number of threads
	     * operating off a shared unbounded queue.  At any point, at most
	     * {@code nThreads} threads will be active processing tasks.
	     * If additional tasks are submitted when all threads are active,
	     * they will wait in the queue until a thread is available.
	     * If any thread terminates due to a failure during execution
	     * prior to shutdown, a new one will take its place if needed to
	     * execute subsequent tasks.  The threads in the pool will exist
	     * until it is explicitly {@link ExecutorService#shutdown shutdown}.
	     *
	     * @param nThreads the number of threads in the pool
	     * @return the newly created thread pool
	     * @throws IllegalArgumentException if {@code nThreads <= 0}
	     */
						
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
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
		
		
		
		//Submitting the Runnable task to thread pool
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.submit(task4);
		
		
		//closing the thread neither it remains active 
		executorService.shutdown();
		
	}
}