package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Properties;

public class TestProperties 
{

	public static void main(String[] args) throws Exception
	{
		TestProperties test = new TestProperties();
		test.test();
	
	}
	
	public void test() throws Exception
	{
		Properties pro = new Properties();
		FileInputStream in = new FileInputStream("D:/properties/test3.properties");
		InputStreamReader inr = new InputStreamReader(in,"UTF-8");
		pro.load(inr);
		System.out.println(pro.getProperty("fastbreakfast"));
		System.out.println(pro.getProperty("a"));
		System.out.println(pro.getProperty("freeIntenet"));
	}
}
