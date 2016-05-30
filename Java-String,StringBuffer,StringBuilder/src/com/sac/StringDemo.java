package com.sac;

public class StringDemo {

	public static void main(String[] args) {
		
		String string = new String("Hello");
		System.out.println(string);
		
		
		String strSecond = string + " Sachin";
		System.out.println(strSecond);
		
		System.out.println(string.concat(" Rahul"));
	}

}
