package com.proxy.staticProxy;

/**
 * 委托类
 * @author pact
 *
 */
public class CountImpl implements Count{

	@Override
	public void queryCount() {
		System.out.println("查看账户。。");
		
	}

	@Override
	public void updateCount() {
		System.out.println("更新账户。。");
		
	}

}
