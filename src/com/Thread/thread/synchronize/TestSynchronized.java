package com.Thread.thread.synchronize;

/**
 * 第一个方法时用了同步代码块的方式进行同步，传入的对象实例是this，表明是当前对象，当然，如果需要同步其他对象实例，也可传入其他对象的实例；
 * 
 * 第二个方法是修饰方法的方式进行同步。因为第一个同步代码块传入的this，所以两个同步代码所需要获得的对象锁都是同一个对象锁，
 * 下面main方法时分别开启两个线程，分别调用test1和test2方法，那么两个线程都需要获得该对象锁，另一个线程必须等待。
 * 下面也给出了运行的结果可以看到：直到test2线程执行完毕，释放掉锁，test1线程才开始执行
	说明synchronized修饰方法和代码块属于同一个锁
 * @author LiHuaSheng
 *
 */
public class TestSynchronized {
	
	public void test1(){
		synchronized(this){
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
	}
	
	public synchronized void test2(){
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
		final TestSynchronized testSynchronized = new TestSynchronized();
		Thread test1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				testSynchronized.test1();
				
			}
		},"test1");
		
		Thread test2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				testSynchronized.test2();
				
			}
		},"test2");
		test1.start();
		test2.start();
	}
}
