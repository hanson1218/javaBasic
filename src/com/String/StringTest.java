package com.String;

public class StringTest 
{
	public static void main(String[] args) {
		StringTest string = new StringTest();
		string.test1();
	}
	
	public void test1()
	{
		String test1 = "abc";
		String test2 = new String("abc");
		String test3 = "abc";
		System.out.println(test1==test2);
		System.out.println(test1==test3);
	}
}
