package com.designpatterns.decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport srReport) {
		super(srReport);
	}
	
	private void reportSort(){
		System.out.println("排名38");
	}
	
	@Override
	public void report(){
		super.report();
		this.reportSort();
	}

}
