package com.classLoad.order;

public class SuperClass 
{
	public static int A=1;
	static{
		A = 2;
	}
	static {  
        System.out.println("父类的静态代码块");
    }
   {                
        System.out.println("父类的代码块");
    }
    public SuperClass(){
        System.out.println("父类的构造方法");
    }  
}
