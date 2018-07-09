package com.ge.sample;

public class CompanyFactory  {

	 Company getCompany(String companyName) {
		 if(companyName==null) {
			 return null;
		 }
		 if(companyName.equalsIgnoreCase("APPLE")) {
			return Apple.getInstance();
		 }else if (companyName.equalsIgnoreCase("MICROSOFT")) {
			return new Microsoft(10,"Microsoft",9899999L);
		 }
		return null;
	 }
}
