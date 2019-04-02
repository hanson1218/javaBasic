package com.proxy.staticProxy;

/**
 * 代理类 ，代理类持有具体类的实例，代为执行具体类实例方法，动态代理则没有
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
