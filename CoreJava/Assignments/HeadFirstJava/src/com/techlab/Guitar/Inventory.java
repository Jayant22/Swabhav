package com.techlab.Guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(Guitar guitar) {

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
