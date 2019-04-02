package com.Thread.thread.synchronize;

/**
 * 类锁（全局锁）对应的就是static synchronized（或者是锁在该类的class或者classloader对象上）
 * synchronized(TestSynchronized1.class)是对TestSynchronized1这个类进行加锁，类里面的属性，方法都是同步的，是针对于特定的类的~~
   synchronized(this){}是对{}这里面的内容进行加锁的，仅仅是针对于当前对象的
 * 
 * 下面都是使用类锁，所以会顺序执行
 * @author LiHuaSheng
 *
 */
public class TestSynchronized1 {

	
	public void test1(){
		synchronized(TestSynchronized1.class){
		//synchronized(this){
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
		final TestSynchronized1 testSynchronized = new TestSynchronized1();
		Thread test1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				testSynchronized.test1();
				
			}
		},"test1");
		
		Thread test2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				TestSynchronized1.test2();
				
			}
		},"test2");
		test1.start();
		test2.start();
	}

}
