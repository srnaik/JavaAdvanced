package com.sac;

public class HelloWorld {
	
	public static void main(String[] args){
		
		
		Hello hello = new Hello();
		HelloWorld helloWorld1 = new HelloWorld();
		HelloWorld helloWorld = null;
		System.out.println(hello.equals(helloWorld));
		System.out.println(helloWorld1.equals(helloWorld1));
		System.out.println(helloWorld1.toString());
		helloWorld1.displayThis();
	}
	
	public void displayThis(){
		System.out.println(this);
	}

}
