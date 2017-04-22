
package com.String;

import java.util.Date;
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
	public void testStringFormat()
	{
		String str = null;
		Date date = new Date();
		//$ 
		str=String.format("%1$td%3$s%1$tm%2$s%1$tY", date,"abc","def");  
		System.out.println(str);
	}
}


	

