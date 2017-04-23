package com.classLoad.Init;

/*
 * 通过子类引用父类的静态字段，只会触发父类的初始化，不会导致子类初始化
 */
public class SuperClass {

	static {
		System.out.println("SuperClass init");
	}
	public static int value = 123;
	
	public static final String HELLOworld = "hello world";
}
