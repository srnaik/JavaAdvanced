package com.sac;

public class CustomRunTimeExceptionDemo {
	
	public void displayString(String message){
		
		if(message == null){
			throw new CustomRunTimeException("Null String Passed");
		}else{
			System.out.println(message);
		}
	}

}
