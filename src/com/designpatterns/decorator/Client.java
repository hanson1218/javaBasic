package com.designpatterns.decorator;

public class Client {
	
	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();
		sr = new HighScoreDecorator(sr);
		sr = new SortDecorator(sr);
		
				
		sr.report();
		sr.sign("老黄");
	}

}
