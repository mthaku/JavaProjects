package com.ge.sample;

public class TestUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyFactory compFactory= new CompanyFactory();
		
		Company comp=compFactory.getCompany("APPLE");
		System.out.println(comp.getCompanyInfo());
		comp=compFactory.getCompany("Microsoft");
		System.out.println(comp.getCompanyInfo());
		Microsoft m = (Microsoft)comp.getClone();
		System.out.println(m.getCompanyInfo());
		comp = new Nokia(20,"Nokia Corporation",888888L);
		System.out.println(comp.getCompanyInfo());
		comp = new Microsoft(40,"Microsoft Corporation",99999L);
		System.out.println(comp.getCompanyInfo());
	}

}
