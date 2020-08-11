package com.techlab.Composite;

public class Files implements IStorable {

	private String name = "";
	private double size;
	private String extension;
	private final String dashValue = "-";

	public Files(String name, double size, String extension) {
		super();
		this.size = size;
		this.extension = extension;
		this.name = name;
	}

	public String getTag() {
		return name;
	}

	public double getType() {
		return size;
	}

	public String getValue() {
		return extension;
	}

	@Override
	public StringBuilder display() {
		StringBuilder sb = new StringBuilder();

		return sb.append("\t" + dashValue + getTag() + "\n");
		
	}

}
