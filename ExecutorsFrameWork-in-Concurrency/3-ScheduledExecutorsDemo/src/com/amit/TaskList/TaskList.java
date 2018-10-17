package com.amit.TaskList;

public class TaskList implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Task Started ............");
		System.out.println(".........................");
		System.out.println("Task End................");
	}
}