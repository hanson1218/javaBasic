package com.Thread.ThreadLocal;

/**
 * ThreadLocal类用来提供线程内部的局部变量。这些变量在多线程环境下访问(通过get或set方法访问)时能保证各个线程里的变量相对独立于其他线程内的变量，ThreadLocal实例通常来说都是private static类型。 
 	总结：ThreadLocal不是为了解决多线程访问共享变量，而是为每个线程创建一个单独的变量副本，提供了保持对象的方法和避免参数传递的复杂性。
 * @author lhs
 *
 */
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
