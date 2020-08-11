package com.techlab.Composite;

public class Control implements IHTML {

	private String tag = "";
	private String type;
	private String value;

	public Control(String tag, String type, String value) {
		super();
		this.type = type;
		this.value = value;
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	@Override
	public StringBuilder parseHTML() {
		StringBuilder sb = new StringBuilder();

		sb.append("<" + getTag() + " type = " + getType() + " value = " + getValue() + ">");

		sb.append("</" + getTag() + ">");

		return sb;
	}

}
