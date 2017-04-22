package com.InnerClass;

public class Goods { 
	private int price = 2;

	//private 级别的内部类
	 private class Content implements Contents {  
		private int price =3;
        private int i = 11 * Content.this.price;  //一个内部类对象可以访问创建它的外部类对象的内容，甚至包括私有变量！
        public int value() {  						//如果同名可以用class.this.price
            return i;  
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
