package com.sac;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSortedSet {

	public static void main(String[] args) {
		
		CollectionSortedSet collectionSortedSet = new CollectionSortedSet();
		collectionSortedSet.treeSetDemo();

	}
	
	
	public void treeSetDemo(){
		
		SortedSet<Integer> sortedTreeSet = new TreeSet<>();
		sortedTreeSet.add(34);
		sortedTreeSet.add(12);
		sortedTreeSet.add(18);
	
		
		
		for (Integer integer : sortedTreeSet) {
			System.out.println(integer);
		}
		
	}

}
