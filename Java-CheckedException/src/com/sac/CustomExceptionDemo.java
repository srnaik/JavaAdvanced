package com.sac;

public class CustomExceptionDemo {
	
	

	public static void main(String[] args) {
		
		CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
		try {
			customExceptionDemo.displayMessage(null);
		} catch (CustomCheckedException e) {
			e.printStackTrace();
		}

	}
	
	public void displayMessage(String message) throws CustomCheckedException{
		
		if(message != null){
			System.out.println(message);
		}else{
			throw new CustomCheckedException("Null Pointer Exception");
		}
	}

}
