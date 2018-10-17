package com.amit.TaskList;

//TaskList class implementing the run method of Runnable interface 
public class TaskList implements Runnable {
    
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Task 5 ............");
	}
}