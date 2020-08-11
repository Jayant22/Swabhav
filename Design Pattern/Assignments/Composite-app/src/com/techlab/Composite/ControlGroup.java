package com.techlab.Composite;

import java.util.ArrayList;

public class ControlGroup implements IHTML {

	private String tag;
	private String id;
	private ArrayList<IHTML> controls = new ArrayList<IHTML>();

	public ControlGroup(String tag) {
		super();
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public String getId() {
		return id;
	}

	public ArrayList<IHTML> getControls() {
		return controls;
	}

	public void addControls(IHTML element) {
		controls.add(element);
	}

	@Override
	public StringBuilder parseHTML() {
		StringBuilder sb = new StringBuilder();

		sb.append("<" + getTag() + ">\n");

		for (IHTML ihtml : controls) {
			sb.append(ihtml.parseHTML());
		}

		sb.append("</" + getTag() + ">\n");

		return sb;

	}

}
