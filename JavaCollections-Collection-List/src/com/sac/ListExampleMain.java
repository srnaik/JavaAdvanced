package com.sac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleMain {
	
	

	public static void main(String[] args) {
		
		List<Integer> linkList = new ArrayList<>();
		
		linkList.add(4);
		linkList.add(-2);
		linkList.add(2);
		linkList.add(9);
		
		Collections.sort(linkList);
		
		for (Integer integer : linkList) {
			System.out.println(integer);
		}
		
		
		

	}

}
