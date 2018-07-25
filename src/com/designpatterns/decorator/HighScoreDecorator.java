package com.designpatterns.decorator;

public class HighScoreDecorator extends Decorator {

	//当父类没有提供无参数的构造函数时，子类的构造函数中必须显式的调用父类的构造函数；
	//如果父类提供了无参数的构造函数，此时子类的构造函数就可以不显式的调用父类的构造函数，默认调用父类的无参构造函数
	public HighScoreDecorator(SchoolReport srReport) {
		super(srReport);
		// TODO Auto-generated constructor stub
	}
	
	private void reportHighScore(){
		System.out.println("最高成绩75");
	}
	
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}

}
