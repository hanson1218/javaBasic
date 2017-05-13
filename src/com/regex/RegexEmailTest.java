package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailTest 
{

	//邮箱
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
		Matcher matcher = pattern.matcher("98@qqi.com");
		System.out.println(matcher.matches());
	}
}
