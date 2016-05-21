package com.sac;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryIdByComparatorMain {

	
	
	public static void main(String[] args) {
		
		List<Country> linkedListCountry = new LinkedList<>();
		
		Country indiaCountry = new Country(2, "India");
		Country usaCountry = new Country(1, "USA");
		Country australiaCountry = new Country(4, "Australia");
		Country chinaCountry = new Country(3, "China");
		
		linkedListCountry.add(indiaCountry);
		linkedListCountry.add(usaCountry);
		linkedListCountry.add(australiaCountry);
		linkedListCountry.add(chinaCountry);
		
		System.out.println("List Elements Before Sorting: ");
		for (Country country : linkedListCountry) {
			System.out.println(country);
		}
		
		//Sorting using Iterator
		/*Iterator<Country> iterator = linkedListCountry.iterator();
		while (iterator.hasNext()) {
			Country country = (Country) iterator.next();
			System.out.println(country);
			
		}*/
		
		Collections.sort(linkedListCountry);
		
		System.out.println("List Elements After Sorting By ID: ");
		for (Country country : linkedListCountry) {
			System.out.println(country);
		}
		
		Collections.sort(linkedListCountry, new Comparator<Country>() {

			@Override
			public int compare(Country country1, Country country2) {
				return (country1.getCountryName().compareTo(country2.getCountryName()));
			}
		});
		
		System.out.println("List Elements After Sorting By Name: ");
		for (Country country : linkedListCountry) {
			System.out.println(country);
		}
	}

}
