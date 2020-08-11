package com.techlab.Composite;

import java.util.ArrayList;

public class Folders implements IStorable {

	private String tag;
	private String id;
	private ArrayList<IStorable> children = new ArrayList<IStorable>();

	private final String dashValue = "--";
	public Folders(String tag) {
		super();
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public String getId() {
		return id;
	}

	public ArrayList<IStorable> getControls() {
		return children;
	}

	public void addChildren(IStorable element) {
		children.add(element);
	}

	@Override
	public StringBuilder display() {
		StringBuilder sb = new StringBuilder();
		sb.append(dashValue + getTag() + "\n");
		for (IStorable iStorable : children) {
			sb.append("\t");
			sb.append(iStorable.display());
		}
		return sb;
				
	}

}
