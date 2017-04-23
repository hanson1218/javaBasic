package com.Thread;

//1.volatile 定义的变量：保证此变量对所有的线程可见性，即一条线程修改了这个变量的值，新值对于其他线程来说是立即得到的（前提：运算结果不依赖变量的当前值）
//2.
public class TestVolatile {

	public static volatile int race = 0;
	
	public static void increase()
	{
		race++;
	}
	
	private static final int THREADS_COUNT = 20;
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[THREADS_COUNT];
		
		for(int i = 0;i < THREADS_COUNT;i++)
		{
			threads[i] = new Thread(new Runnable(){

				@Override
				public void run() {
					for(int i = 0;i< 10000; i++)
					{
						increase();
					}
					
				}
				
			});
			threads[i].start();
		}
		
		//等待所有累加线程都结束
		while(Thread.activeCount()>1)
			Thread.yield();
		
		System.out.println(race);
	}
}
