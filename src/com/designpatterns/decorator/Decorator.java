package com.designpatterns.decorator;

public abstract class Decorator extends SchoolReport{
	
	private SchoolReport srReport;

	public Decorator(SchoolReport srReport) {
		super();
		this.srReport = srReport;
	}


	@Override
	public void report() {
		this.srReport.report();
		
	}

	@Override
	public void sign(String name) {
		this.srReport.sign(name);
		
	}
	
}
