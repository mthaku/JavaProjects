package com.ge.sample;

public interface Company {
	
	default  Company getClone() {
		return null;
		
	}
	public String getCompanyInfo();

}
