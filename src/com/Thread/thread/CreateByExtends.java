package com.Thread.thread;

import org.junit.Test;

/**
 * 在Java当中，线程通常都有五种状态，创建、就绪、运行、阻塞和死亡： 
　　创建:当new出线程对象，并没有调用该对象的start方法，这是线程处于创建状态。 
　　就绪:当调用了线程对象的start方法之后，该线程就进入了就绪状态，但是此时线程调度程序还没有把该线程设置为当前线程，只是告诉CPU我已经进入了等待被调用的状态了，此时处于就绪状态。在线程运行之后，从等待或者睡眠中回来之后，也会处于就绪状态。 
　　运行:线程调度程序将处于就绪状态的线程设置为当前线程，此时线程就进入了运行状态，开始运行run函数当中的代码。 
　　阻塞:线程正在运行的时候，被暂停，通常是为了等待某个事件的发生(比如说某项资源就绪)之后再继续运行。sleep，suspend，wait等方法都可以导致线程阻塞。 
　　死亡:如果一个线程的run方法执行结束或者调用stop方法后，该线程就会死亡。对于已经死亡的线程，无法再使用start方法令其进入就绪。

    创建线程有2中方式，一个是实现Runnable，一个是继承Thread.但都是调用Thread的构造器
 * @author LiHuaSheng
 *
 */
public class CreateByExtends extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"当前线程名称"+Thread.currentThread().getName());
		}
	};
	
	/**
	 * start()用来启动一个线程，当调用start()方法时，系统才会开启一个线程，通过Thead类中start()方法来启动的线程处于就绪状态（可运行状态），
	 * 此时并没有运行，一旦得到CPU时间片，就自动开始执行run()方法。此时不需要等待run()方法执行完也可以继续执行下面的代码，
	 * 所以也由此看出run()方法并没有实现多线程
	 */
	@Test
	public void testStart(){
		CreateByExtends createByExtends = new CreateByExtends();
		createByExtends.start();
		System.out.println("test");
	}
	
	/**
	 * run()方法是在本线程里的，只是线程里的一个函数,而不是多线程的。如果直接调用run(),
	 * 其实就相当于是调用了一个普通函数而已，直接待用run()方法必须等待run()方法执行完毕才能执行下面的代码，
	 * 所以执行路径还是只有一条，根本就没有线程的特征，所以在多线程执行时要使用start()方法而不是run()方法。
	 */
	@Test
	public void testRun(){
		CreateByExtends createByExtends = new CreateByExtends();
		createByExtends.run();
		System.out.println("test");
	}
	
}
