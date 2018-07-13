package com.InnerClass.niming;

/**
 * 匿名内部类不能定义任何静态成员、方法。

匿名内部类中的方法不能是抽象的；

匿名内部类必须实现接口或抽象父类的所有抽象方法。

匿名内部类访问的外部类成员变量或成员方法必须用static修饰；
 * @author pact
 *
 */
public abstract class Bird {

	 private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract int fly();
    
    public Bird(String name)
    {
    	this.name = name;
    }
    
    
}
