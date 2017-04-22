package com.InnerClass.niming;

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
