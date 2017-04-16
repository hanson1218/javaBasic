package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Stream是元素的集合，这点让Stream看起来用些类似Iterator；
//可以支持顺序和并行的对原Stream进行汇聚的操作；
//具体：
//1.创建Stream；
//2.转换Stream，每次转换原有Stream对象不改变，返回一个新的Stream对象（**可以有多次转换**）；
//3.对Stream进行聚合（Reduce）操作，获取想要的结果；
public class TestStreaming 
{
	public static void main(String[] args) 
	{
		TestStreaming test = new TestStreaming();
		
		test.testEarlier();	
		test.testNow();
		test.test1();
	}
	
	//1.7
	public List  testEarlier()
	{
		List<Integer> bigList = new ArrayList<>();
		bigList.add(1);
		bigList.add(12);
		bigList.add(43);
		bigList.add(153);
		bigList.add(40);
		List<Integer> filteredList = new ArrayList<>();  
	    for (Integer p : bigList)  {  
	        if (p  > 40) {  
	            filteredList.add(p);  
	        }   
	    }  
	    System.out.println(filteredList.toString());
	    return filteredList; 
	}
	
	//1.8
	public void testNow()
	{
		List<Integer> bigList = new ArrayList<>();
		bigList.add(1);
		bigList.add(12);
		bigList.add(43);
		bigList.add(153);
		bigList.add(40);
		System.out.println(bigList.stream().filter(p -> p > 40).collect(Collectors.toList()));
																//(可变汇聚)
	}
	
	//创建stream 转换stream
	public void test1()
	{
//		Stream<Integer> integerStream = Stream.of
//		Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(null);
		nums.add(4);
		nums.add(7);
		nums.add(null);
		nums.add(9);
		nums.add(null);
		nums.add(10);
		nums.add(12);
		System.out.println("sum is:”"+ nums.stream().filter(num -> num != null).
		distinct().mapToDouble(num -> num * 2).peek(System.out::println).skip(2).limit(4).sum());
		//计算集合中所有元素的和
		System.out.println("ints sum is:" + nums.stream().filter(num  -> num !=null).reduce((sum, item) -> sum + item).get());
		//count方法：获取Stream中元素的个数。
		System.out.println(nums.stream().count());
//		
	}
	
	
}
