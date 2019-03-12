package com.io.serializable;

import java.io.Serializable;
import java.util.Date;

/**
 * serialVersionUID这个数字是JVM(JAVA虚拟界)通过一个类的类名、成员、包名、工程名算出的一个数字
 * 如果序列化与反序列化的时候可能会修改类的成员，那么最好一开始就给这个类指定一个serialVersionUID，如果类已经指定的serialVersionUID，然后
	在序列化与反序列化的时候，jvm都不会再自己算这个 class的serialVersionUID了，会直接去匹配相应的值，
	如果不实现，但是改了对象的属性，可能会报找不到serialVersionUID的错误
	当你不想要某些字段序列化时候，可以用transient关键字修饰
 * @author LiHuaSheng
 *
 */
public class Person implements Serializable{

	/**
	 * 
	 */
//	private static final long serialVersionUID = -7303440220352964214L;
	private String name;                                 //名字
	private int year;                                    //年龄
	private String city;                                 //城市
	private Date birth;
	private String aString = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	/**
	 * 重写toString，不然序列化之后显示的是内存地址
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", year=" + year + ", city=" + city
				+ ", birth=" + birth + "]";
	} 
	
	
}
