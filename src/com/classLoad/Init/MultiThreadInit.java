package com.classLoad.Init;

/**
 * 多个线程去初始化同一个类，只有一个线程会执行这个类的init
 * @author lhs
 *
 */
public class MultiThreadInit 
{

	static class DeadLoopClass
	{
		static {
			/*if(true)
			{
				System.out.println(Thread.currentThread()+"init DeadLoopClass");
				while(true){}
			}*/
			System.out.println(Thread.currentThread()+"init DeadLoopClass");
		}
	}
	
	
	public static void main(String[] args) {
		Runnable script = new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "start");
				DeadLoopClass dlc = new DeadLoopClass();
				System.out.println(Thread.currentThread() + "run over");
				
			}
			
		};
		
		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.start();
		thread2.start();
	}
}
