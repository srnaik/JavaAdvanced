package com.sac;

public class Box<T> {

	private T t;
	
	public void add(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public static void main(String[] args){
		Box<Integer> integerBox = new Box<>();
		Box<String> stringBox = new Box<>();
		
		integerBox.add(new Integer(10));
		stringBox.add(new String("Sachin"));
		
		System.out.println("Added Integer Value: " + integerBox.get());
		System.out.println("Added String Value: "+ stringBox.get());
		
		
	}
}
