package com.Thread.thread.synchronize;

public class Singleton {
	//volatile 保证多线程环境下的可见性
	private static volatile Singleton instance;  
    
    private Singleton() {  
         
    }  
    public static Singleton getInstance(){  
        if (instance == null) {  
            synchronized (Singleton.class) {  
                if (instance == null) {  
                    instance = new Singleton();  
                }  
            }  
        }  
         
        return instance;  
    }
}
