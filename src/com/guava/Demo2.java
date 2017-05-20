package com.guava;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.primitives.Ints;

public class Demo2 {

	@Test
	public void testImmutableList()
	{
		ImmutableList<String> of = ImmutableList.of("a", "b", "c", "d");
		of.forEach(a->System.out.println(a));
	}
	
	/**
	 * list to array
	 */
	@Test
	public void listToArray()
	{
		List<Integer> list = Lists.newArrayList(1,2,3,4);
		int[] array2 = Ints.toArray(list);
		for(Integer a : array2)
		{
			System.out.println(a);
		}
		//数组中是否包含某个特定数字
		System.out.println(Ints.contains(array2, 1));
		//比较大小
		System.out.println(Ints.compare(1, 2));
		//filter 字符串中的数据
		System.out.println(CharMatcher.DIGIT.removeFrom("some text 89983 and more"));
	}
	
	@Test
	public void multiMap()
	{
		Multimap<String, String> multimap = HashMultimap.create();
		multimap.put("java", "jdk1.7");
		multimap.put("java", "jdk1.8");
		Collection<String> collection = multimap.get("java");
		System.out.println(multimap.get("java"));
	}
}
