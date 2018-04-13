package com.Thread.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {

	
	
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		Processor processor = new Processor();
		executorService.execute(processor);
		executorService.execute(processor);
		executorService.execute(processor);
		executorService.execute(processor);
		
		/*Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Runnable() {
				
				@Override
				public void run() {
					int num = local.get();
					num+=5;
					System.out.println(Thread.currentThread().getName()+":"+num);
				}
			});
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}*/
	}
}
