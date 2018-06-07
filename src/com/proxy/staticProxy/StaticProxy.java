package com.proxy.staticProxy;

/**
 * 代理类
 * @author pact
 *
 */
public class StaticProxy implements Count{

	private Count count;
		
	public StaticProxy(Count count) {
		this.count = count;
	}
	
	@Override
	public void queryCount() {
		System.out.println("进入代理类 queryCount()方法");
		count.queryCount();
		
	}

	@Override
	public void updateCount() {
		System.out.println("进入代理类 updateCount()方法");
		count.updateCount();
		
	}

}
