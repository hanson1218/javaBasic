package com.designpatterns.decorator;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		System.out.println("20 分");
	}

	@Override
	public void sign(String name) {
		System.out.println("家长签名："+name);
		
	}

}
