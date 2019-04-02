package com.Thread.thread;

import org.junit.Test;

public class CreateByImpl implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"当前线程名称"+Thread.currentThread().getName());
		}
	}
	
	@Test
	public void testRun(){
		CreateByImpl createByImpl = new CreateByImpl();
		createByImpl.run();
	}
	
	@Test
	public void testStart(){
		CreateByImpl createByImpl = new CreateByImpl();
		Thread thread = new Thread(createByImpl,"IMPL");
		thread.start();
	}

}
