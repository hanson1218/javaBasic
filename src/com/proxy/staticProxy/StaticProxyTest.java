package com.proxy.staticProxy;

public class StaticProxyTest {

	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();
		StaticProxy staticProxy = new StaticProxy(countImpl);
		staticProxy.queryCount();
		staticProxy.updateCount();
	}
}
