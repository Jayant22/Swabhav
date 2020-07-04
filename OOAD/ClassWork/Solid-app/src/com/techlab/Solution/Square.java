package com.techlab.Solution;

public class Square extends IShapeable {

	public int Sides;

	public int getSides() {
		return Sides;
	}

	public void setSides(int sides) {
		Sides = sides;
	}

	@Override
	public int Area() {
		return Sides * Sides;
	}

	@Override
	public String toString() {
		return "Square [Sides=" + Sides + ", getSides()=" + getSides() + ", Area()=" + Area() + "]";
	}

	
}
