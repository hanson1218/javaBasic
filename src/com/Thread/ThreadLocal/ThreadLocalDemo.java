package com.Thread.ThreadLocal;


public class ThreadLocalDemo {

	public  static ThreadLocal<Integer> local = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[5];
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
		}
	}
}
