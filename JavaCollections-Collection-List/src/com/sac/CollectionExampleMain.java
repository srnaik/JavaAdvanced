package com.sac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionExampleMain {

	public static void main(String[] args) {
		
		 Collection<Object> arrayListOne  = new ArrayList<>();
		 Collection<Object> linkedListOne = new LinkedList<>();
		 Collection<Object> setCollection = new HashSet<>();
		 
		 arrayListOne.add("ArrayList 01");
		 linkedListOne.add("LinkedList 02");
		 
		 setCollection.add(linkedListOne);
		 setCollection.add(arrayListOne);
		 setCollection.add(linkedListOne);
		 
		 CollectionExampleMain exampleMain = new CollectionExampleMain();
		 exampleMain.iterateObjects(setCollection);
		 
		 
		}
	
	
	public void iterateObjects(Collection<Object> collection){
		
		//Iterator<Object> iterator = collection.iterator();
		for (Object object : collection) {
			System.out.println(object);
		}
	}

}
