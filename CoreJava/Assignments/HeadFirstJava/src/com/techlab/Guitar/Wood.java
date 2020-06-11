package com.techlab.Guitar;

public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, ALDER, STIKA;
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD: return "Indian_Rosewood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian_Rosewood";
		case MAHOGANY: return "mahogany";
		case ALDER: return "alder";
		case STIKA: return "stika";
		}
		return null;
	}
}
