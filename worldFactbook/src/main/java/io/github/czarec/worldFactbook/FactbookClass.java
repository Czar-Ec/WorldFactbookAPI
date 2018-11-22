package io.github.czarec.worldFactbook;

import java.util.ArrayList;

/**
 * Class that holds the factbook data that the controller queries
 * and the Scheduler hourly refreshes (rescans the file)
 * 
 * @author CzarEc
 *
 */
public class FactbookClass {
	
	// arraylist containing list of countries by category
	ArrayList<ArrayList<?>> countryCategories;
	
	FactbookClass() {
		countryCategories = new ArrayList<ArrayList<?>>();
		
		scanFolder();
	}
	
	private void scanFolder() {
		// scan a folder
		// make a key value pair, key is file name, value is the json value within
	}
	
	public String getCountry() {
		return "null for now";
	}
}
