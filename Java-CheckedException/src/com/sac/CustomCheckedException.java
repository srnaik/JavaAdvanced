package com.sac;

public class CustomCheckedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomCheckedException() {
		
	}
	
	public CustomCheckedException(String message){
		super(message);
	}
	
	

}
