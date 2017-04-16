package com.java8;

//1.实现多个接口时，接口中有重名的方法体的实现。

//如果同时实现两个具有相同方法名且实现了该方法的接口，
//需要提供自己对该方法的实现。才可以解决冲突。
//2.接口 A 和 类 B 中都定义了方法 sayHello() 的实现，类 C 优先使用 类 B 的方法。 
public class TestInterfaceMethod implements InterfaceA,InterfaceB
{

	public static void main(String[] args) 
	{
		TestInterfaceMethod method = new TestInterfaceMethod();
		method.sayHello();//Hi c
		
	}

	//类方法的 优先级 高于 接口方法
	public void sayHello() {
		System.out.println("Hi c!");
	}

	@Override
	public void showA(String a) {
		// TODO Auto-generated method stub
		
	}
	
	 
}


