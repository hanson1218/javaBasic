package com.Thread.ThreadLocal;

public class Processor implements Runnable {

	public  static ThreadLocal<Integer> local = new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	@Override
	public void run() {
		int num = local.get();
		num +=5;
		System.out.println(Thread.currentThread().getName()+":"+num);
		
	}

}
