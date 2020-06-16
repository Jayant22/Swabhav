package com.techlab.Guitar.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

import com.techlab.Guitar.*;

class JUnitGuitarTest {

	@Test
	void testAddGuitar() {

		// Arrange
		String expectedserialNumber = "12abc";
		double expectedPrice = 500;
		Builder expectedBuilder = Builder.FENDER;
		String expectedModel = "xyz";
		Type expectedType = Type.ACOUSTIC;
		Wood expectedBackWood = Wood.ALDER;
		Wood expectedTopWood = Wood.ALDER;
		int  expectednumStrings =12;

		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,12);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);

		// Assert
		assertEquals(expectedserialNumber, g.getSerialNumber());
		assertEquals(expectedPrice, g.getPrice());
		assertEquals(expectedBuilder, s.getBuilder());
		assertEquals(expectedModel, s.getModel());
		assertEquals(expectedType, s.getType());
		assertEquals(expectedBackWood, s.getBackWood());
		assertEquals(expectedTopWood, s.getTopWood());
		assertEquals(expectednumStrings, s.getNumStrings());
	}

	@Test
	void testGetGuitar() {

		// Arrange
		String expectedSerialNumber = "12abc";
		double expectedPrice = 500;
		Builder expectedBuilder = Builder.FENDER;
		String expectedModel = "xyz";
		Type expectedType = Type.ACOUSTIC;
		Wood expectedBackWood = Wood.ALDER;
		Wood expectedTopWood = Wood.ALDER;
		int  expectednumStrings =12;

		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,12);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);

		Guitar getGuitar = i.getGuitar("12abc");
		GuitarSpecs spec = getGuitar.getSpec();

		// Assert
		assertEquals(expectedSerialNumber, getGuitar.getSerialNumber());
		assertEquals(expectedPrice, getGuitar.getPrice());
		assertEquals(expectedBuilder, spec.getBuilder());
		assertEquals(expectedModel, spec.getModel());
		assertEquals(expectedType, spec.getType());
		assertEquals(expectedBackWood, spec.getBackWood());
		assertEquals(expectedTopWood, spec.getTopWood());
		assertEquals(expectednumStrings, s.getNumStrings());
	}

	@Test
	void testSearch() {

		// Arrange
		Builder expectedBuilder = Builder.FENDER;
		String expectedModel = "xyz";
		Type expectedType = Type.ACOUSTIC;
		Wood expectedBackWood = Wood.ALDER;
		Wood expectedTopWood = Wood.ALDER;
		int  expectednumStrings =12;

		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,12);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);

		GuitarSpecs searchSpec = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,12);
		List spec = i.search(searchSpec);

		// Assert
		for (Iterator i1 = spec.iterator(); i1.hasNext();) {
			Guitar guitar = (Guitar) i1.next();
			GuitarSpecs x = guitar.getSpec();
			assertEquals(expectedBuilder, x.getBuilder());
			assertEquals(expectedModel, x.getModel());
			assertEquals(expectedType, x.getType());
			assertEquals(expectedBackWood, x.getBackWood());
			assertEquals(expectedTopWood, x.getTopWood());
			assertEquals(expectednumStrings, s.getNumStrings());
		}
	}
	
	@Test
	void testMatches() {
		
		// Arrange
		boolean expectedResult = true;
		
		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER,12);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);
		
		boolean result = s.matches(s);
		
		// Assert
		assertEquals(expectedResult, result);
		
		
	}

}
