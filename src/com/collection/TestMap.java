package com.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap 
{
	
	String key = "key";
	
	public static void main(String[] args) {
		TestMap map = new TestMap();
		map.test();
		map.test1();
	}
	
	// map的值是否改变
	public void test()
	{
		String str1 = "abc";
		String str2 = "123";
		Map<String, String> map = new HashMap<>();
		map.put(key, str1);
		str1= str2;
		System.out.println(map.get(key));
		
		
	}
	
	public void test1()
	{
		String key ="key1";
		Map<String, String> map1 = new HashMap<>();
		map1.put(key, "test1");
		String test1 = map1.get(key);
		test1 = "test2";
		System.out.println(key);
		System.out.println(map1.get(key));
	}
}
