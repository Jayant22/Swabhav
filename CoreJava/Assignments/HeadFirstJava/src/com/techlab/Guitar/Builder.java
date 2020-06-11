package com.techlab.Guitar;

public enum Builder {

	FENDER, MARTIN, GIBSON, COLLINGS, OLSON;
	
	public String toString() {
		switch(this) {
		case FENDER: return "fender";
		case MARTIN: return "martin";
		case GIBSON: return "gibson";
		case COLLINGS: return "collings";
		case OLSON: return "olson";
		}
		return null;
	}
}
