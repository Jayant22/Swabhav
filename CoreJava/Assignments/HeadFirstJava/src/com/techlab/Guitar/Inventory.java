package com.techlab.Guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, 
			Builder builder, String model, 
			Type type, Wood backWood, Wood topWood, int numStrings) {
		
		Guitar guitar = new Guitar(serialNumber, price, new GuitarSpecs(builder, model, type, backWood, topWood, numStrings));
		guitars.add(guitar);
		
	}

	public Guitar getGuitar(String serialNumber) {
		for(Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	
	public List search(GuitarSpecs searchSpec) {
		List matchingGuitar = new LinkedList();

		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSpec().matches(searchSpec)) {
				matchingGuitar.add(guitar);
			}
		}
		return matchingGuitar;
	}

}
