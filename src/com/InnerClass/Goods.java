package com.InnerClass;

public class Goods { 
	private int price = 2;

	//private 级别的内部类
	 private class Content implements Contents {  
		private int price =3;
        private int i = 11 * Content.this.price;  //一个内部类对象可以访问创建它的外部类对象的内容，甚至包括私有变量！普通的内部类对象隐含地保存了一个引用，指向创建它的外围类对象
        public int value() {  						//如果同名可以用class.this.price
            return i;  								//如果是静态内部类，不依赖于外部类，只是为了降低包的深度，方便类的使用，静态内部类适用于包含类当中，但又不依赖与外在的类，不用使用外在类的非静态属性和方法，只是为了方便管理类结构而定义
        }  
	}  
	 
	//protected 级别的内部类
	 protected class GDestination implements Destination {  
        private String label;  
        private GDestination(String whereTo) {  
            label = whereTo;  
        }
		@Override
		public String readLabel() {
			return label;
		}  
        
          
	}  
	 
	 public Destination dest(String s) {  
	        return new GDestination(s);  
	 }  
	 
	 public Contents cont() {  
	        return new Content();  
	 } 
	 
}
