package com.sac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CountryNameByComparable {

	public static void main(String[] args) {
		
		Country australia = new Country(4, "Australia");
		Country india = new Country(1, "India");
		Country newZeLand = new Country(3, "NewZeLand");
		Country unitedStates = new Country(2,"United States");
		
		List<Country> arlList = new ArrayList<>();
		arlList.add(australia);
		arlList.add(india);
		arlList.add(newZeLand);
		arlList.add(unitedStates);
		
		
		System.out.println("Collection Items before sorting: ");
		for (Country country : arlList) {
			System.out.println(country);
		}
		
		Collections.sort(arlList);
		System.out.println("Collection items after sorting by ID: ");
		for (Country country : arlList) {
			System.out.println(country);
		}
		
		
	}

}
