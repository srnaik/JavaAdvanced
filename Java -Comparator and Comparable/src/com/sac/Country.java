package com.sac;

public class Country implements Comparable<Country>{
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

	private int countryId;
	private String countryName;
	
	public Country(int countryId, String countryName) {
		this.countryId = countryId;
		this.countryName = countryName;
	}
	
	public int getCountryId() {
		return countryId;
	}
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Override
	public int compareTo(Country country) {
		/*return (this.countryId < country.countryId ) ? -1: 
			(this.countryId > country.countryId ) ? 1:0;*/
		
		if(this.countryId < country.countryId){
			return -1;
			
		}else if(this.countryId > country.countryId){
			return 1;
		}
		
		return 0;
	}
	
	
	

}
