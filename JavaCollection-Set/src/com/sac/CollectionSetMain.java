package com.sac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetMain {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		CollectionSetMain collectionSetMain = new CollectionSetMain();
		collectionSetMain.hashSetDemo();
		collectionSetMain.linkedHashSetDemo();
		collectionSetMain.treeSetDemo();

	}

	/**
	 * HashSet Demo
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void hashSetDemo(){
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Sachin");
		hashSet.add("Sadan");
		hashSet.add("Sachin");
		
		
		Set nonGenericSet = new HashSet<>();
		nonGenericSet.addAll(hashSet);
		
		for (Iterator iterator = nonGenericSet.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
	
	/**
	 * LinkedHashSet Demo
	 */
	public void linkedHashSetDemo(){
		
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(16);
		linkedHashSet.add(1);
		linkedHashSet.add(10);
		
		
		for (Integer integer : linkedHashSet) {
			System.out.println(integer);
		}
	}
	
	/**
	 * Sorts the Elements
	 */
	public void treeSetDemo(){
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(12);
		treeSet.add(10);
		treeSet.add(8);
		
		for (Integer integer : treeSet) {
			System.out.println(integer);
		}
	}
}
