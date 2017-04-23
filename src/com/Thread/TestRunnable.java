package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		 while (count --> 0) {  
	            System.out.print(status());  
	            Thread.yield();  
	        }  
	        System.out.println();
	}
	
	protected int count = 10;
	private static int taskCount = 0;  
	private final int id = taskCount++;  
	
	public TestRunnable(int count)
	{
		this.count = count;
	}
	
	 public String status() {  
	       return "#" + id + "(" + (count > 0 ? count : "TestRunnable! ") + ")";  
	 } 
	 
	 public static void main(String[] args) {
		
		 ExecutorService exec = Executors.newFixedThreadPool(1);  
	        for (int i = 0; i < 5; i++) {  
	            exec.execute(new TestRunnable(i));  
	        }  
	        exec.shutdown(); 
	}

}
