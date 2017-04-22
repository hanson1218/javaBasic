package com.InnerClass;


public class InnerClassTest 
{

	public static void main(String[] args) 
	{
		Goods goods = new Goods();
		Contents c = goods.cont();
		System.out.println(c.value()); 
		Destination g = goods.dest("beijing");
		System.out.println(g.readLabel());
		
//		Goods.GDestination conten = Goods.new Destination("B");要想创建内部类，必须先创建外部类
	}
	
}
