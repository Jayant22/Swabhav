package com.techlab.person;

public class Person {

	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;
	private final int DEFAULT_AGE = 25, INVALID_AGE = 0;
	private double BMI;

	public Person(String name, int age, String gender, float height, float weight) {

		if(name.isEmpty())
			this.name = "Unspecified";
		else
			this.name = name;
		
		if(age < INVALID_AGE)
			this.age = Math.abs(age);
		else
			this.age = age;
		
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public Person(String name, String gender, float height, float weight) {
		this(name, 0, gender, height, weight);
		this.age = DEFAULT_AGE;
	}
	
	private void age() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public double getBMI() {
		return BMI;
	}
	
	public void doWorkOut() {
		weight = (float) (weight - (weight * 0.2));
	}
	
	public void doEat() {
		weight = (float) (weight + (weight * 0.05));
	}	
	
	public void calulateBMI() {
		BMI = weight / Math.pow(height, 2);
	}
}
