package com.techlab.Guitar;

public class GuitarSpecs {

	private int numStrings;
	private String model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	public GuitarSpecs(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	public Type getType() {
		return type;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	
	public int getNumStrings() {
		return numStrings;
	}
	
	public String getModel() {
		return model;
	}
	
	public boolean matches(GuitarSpecs spec) {
		if(builder != spec.builder)
			return false;			
		if((model != null) && (!model.equals("")) && (!model.equals(spec.model)))
			return false;			
		if(type != spec.type)
			return false;			
		if(numStrings != spec.numStrings)
			return false;			
		if(backWood != spec.backWood)
			return false;			
		if(topWood != spec.topWood) 
			return false;			
		return true;
	}
	
}
