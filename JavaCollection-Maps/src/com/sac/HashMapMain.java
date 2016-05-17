package com.sac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMapMain hashMapMain = new HashMapMain();
		hashMapMain.hashMap();

	}
	
	
	public void hashMap(){
		
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("one", 1);
		hashMap.put("Two", 2);
		hashMap.put("Ten", 10);
		
		//KeySet Iterator
		Iterator<String> iterator = hashMap.keySet().iterator();
		
		
		//Iterating from for-each loop
		for (String str: hashMap.keySet()) {
			System.out.println(hashMap.get(str));
		}
		
		//Iterating from while loop
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(hashMap.get(object));
			
		}
		
	}
	
	

}
