package com.String;

import java.util.Date;

public class StringTest 
{

	public static void main(String[] args) 
	{
		StringTest test = new StringTest();
		test.testStringFormat();
	}
	
	public void testStringFormat()
	{
		String str = null;
		Date date = new Date();
		//$ ʱ���ʹ�� 
	    str=String.format("��ʽ����$��ʹ�ã�%1$td%3$s%1$tm%2$s%1$tY", date,"abc","def");  
	    System.out.println(str);
	}
}
