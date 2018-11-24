package io.github.czarec.worldFactbook;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
		
		// scan the folder on startup
		scanFolder();
	}
	
	private void scanFolder() {
		// clear already existing values
		countryCategories.clear();
		
		// scan a folder
		// make a key value pair, key is file name, value is the json value within
		Path p = Paths.get("\\factbook\\");
		
		if(Files.exists(p)) {
			System.out.println("yeet");
		} else {
			System.out.println("neet");
		}
	}
	
	public String getCountry() {
		return "null for now";
	}
}
