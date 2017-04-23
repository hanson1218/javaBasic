package com.classLoad.Init;

public class NotInitialization {

	//
	public static void main(String[] args) {
		System.out.println(SubClass.value);//通过子类引用父类的静态字段，只会触发父类的初始化，不会导致子类初始化
//		SuperClass[] sca = new SuperClass[10];
//		System.out.println(SuperClass.HELLOworld);//结果：只加载了这个常量
													//虽然NotInitialization引用了superClass的常量，但是在编译阶段已经将
													//SuperClass.HELLOworld存储在NotInitialization的常量池了
	}
	
	static int i =0;
	static {                          //静态语句块只能访问定义在它之前的变量。定义在它之后的变量可以赋值，不能访问
		i =0;						   //赋值可以编译通过
		System.out.println(i);		   //访问会报错
	}
	
//	static int i =1;
}
