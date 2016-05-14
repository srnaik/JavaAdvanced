package com.sac;

public class JavaGenerics {
	
	private Integer[] intArray;
	private String[] stringArray;
	private Double[] doubleArray;
	
	public <E> void printArray(E[] arrayType){
		
		for (E e : arrayType) {
			System.out.println("Array Element: " + e);
		}
		
	}

	public static void main(String[] args) {
		
		JavaGenerics generics = new JavaGenerics();
		
		generics.intArray = new Integer[3];
		
		generics.intArray[0] = 1;
		generics.intArray[1] = 2;
		generics.intArray[2] = 3;
		
		generics.stringArray = new String[2];
		
		generics.stringArray[0] = "Hello";
		generics.stringArray[1] = "World";
		
		generics.doubleArray = new Double[2];
		
		generics.doubleArray[0] = 1.0;
		generics.doubleArray[1] = 2.0;
		
		generics.printArray(generics.intArray);
		generics.printArray(generics.stringArray);
		generics.printArray(generics.doubleArray);
		
	}
	
	
}
