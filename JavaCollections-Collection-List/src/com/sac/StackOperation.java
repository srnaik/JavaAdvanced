package com.sac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StackOperation {
	
	private List<Integer> arrayList;
	
	public void push(int item){
		
		if(arrayList == null){
			arrayList = new ArrayList<>();
			arrayList.add(item);
		}else{
			arrayList.add(item);
		}
	}
	
	
	public void pop(){
		
		if(arrayList.size() == 0){
			System.out.println("Array List is Empty");
		}else{
			arrayList.remove(arrayList.get(arrayList.size()-1));
		}
	}
	
	public void sort(){
		
		if(arrayList != null && arrayList.size() >0)
		Collections.sort(arrayList);
		else
		 System.out.println("ArrayList is empty");
	}
	
	public void display(){
		
		if(arrayList != null && arrayList.size() >0){
			for (Integer integer : arrayList) {
				System.out.println(integer);
			}
		}
	}
	
	
	public void search(int item){
		
		if(arrayList.size() > 0){
			
			if(arrayList.contains(item)){
				System.out.println("Item Found");
			}else{
				System.out.println("Item Not Found");
			}
		}else{
			System.out.println("No Elements in the Stack");
		}
	}
	
	public static void main(String[] args){
		
		StackOperation operation = new StackOperation();
		
		operation.push(10);
		operation.push(7);
		operation.push(8);
		
		operation.display();
		
		operation.display();
		operation.sort();
		System.out.println("Least Element " + operation.arrayList.get(0));
		
		operation.search(11);
	}
	

}
