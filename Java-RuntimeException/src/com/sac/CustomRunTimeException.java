package com.sac;

public class CustomRunTimeException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2096789584986396507L;
	private String message;
	
	public CustomRunTimeException() {
		System.out.println("Default Constructor");
	}

	public CustomRunTimeException(String message){
		super(message);
		this.message = message;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " getMessage()" + message;
	}
}
