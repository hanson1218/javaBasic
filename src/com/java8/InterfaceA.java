package com.java8;

public interface InterfaceA 
{
	void showA(String a);  
    default void sayHello(){  
        System.out.println("Hello, A!");  
    }  
}
