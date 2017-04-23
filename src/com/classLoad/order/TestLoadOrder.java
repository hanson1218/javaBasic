package com.classLoad.order;

public class TestLoadOrder extends  SuperClass 
{
	
	public static void main(String[] args) {
		TestLoadOrder test = new TestLoadOrder();
		System.out.println(B);
		
	}
	
	public static int B = A;
	
	 //静态变量
    static String STATIC_FIELD = "子类的静态属性";
    //静态代码块
    static {
    	System.out.println(STATIC_FIELD);
    	System.out.println("子类的静态代码块");
    }
    
    //非静态属性
    String field = "子类的非静态属性";

    //非静态代码块
    {
         System.out.println(field);
         System.out.println("子类的非静态代码块");
    }


    //构造函数
    public TestLoadOrder() {
         System.out.println("子类的构造器");
    }

}
