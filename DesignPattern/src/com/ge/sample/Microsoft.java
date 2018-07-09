package com.ge.sample;

public class Microsoft implements Company{
	
	private int companyId;
	private String companyName;
	private Long contact;
	
	
	Microsoft(){
		
	}
	
	

	public Microsoft(int companyId, String companyName, Long contact) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.contact = contact;
	}



	@Override
	public String getCompanyInfo() {
		// TODO Auto-generated method stub
		return "Company id : "+companyId+" Name: " +companyName+" Contact: "+contact;
	}
	
	public Company getClone() {
		
		return new Microsoft(companyId,companyName,contact);
	}

}
