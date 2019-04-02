package com.Thread.thread.synchronize;

/**
 * 下面代码synchronized同时修饰静态方法和实例方法，但是运行结果是交替进行的，
 * 这证明了类锁和对象锁是两个不一样的锁，控制着不同的区域，它们是互不干扰的。
 * 同样，线程获得对象锁的同时，也可以获得该类锁，即同时获得两个锁，这是允许的。
 * @author LiHuaSheng
 *
 */
public class TestSynchronized2 {

	public synchronized void test1(){
		int i=5;
		while(i-->0){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
	
	public static synchronized void test2(){
			int i=5;
			while(i-->0){
				System.out.println(Thread.currentThread().getName()+":"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	
	public static void main(String[] args) {
		final TestSynchronized2 testSynchronized = new TestSynchronized2();
		Thread test1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				testSynchronized.test1();
				
			}
		},"test1");
		
		Thread test2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				TestSynchronized2.test2();
				
			}
		},"test2");
		test1.start();
		test2.start();
	}


}
