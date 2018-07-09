package com.ge.sample;

public class Apple implements Company {

	private static Apple app;
    private Apple() {
	 
   }

	@Override
	public String getCompanyInfo() {
		// TODO Auto-generated method stub
      
		return "This is Apple";
	}
	
/* This method will return single instance of Apple
 * @Param: none
 * return:instance of Apple
 * */	
	public static Apple getInstance() {
		if(app==null) {
			app= new Apple();
		}
		return app;
	}

}
