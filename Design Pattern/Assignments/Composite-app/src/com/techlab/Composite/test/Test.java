package com.techlab.Composite.test;

import java.io.*;
import java.util.ArrayList;

import com.techlab.Composite.Control;
import com.techlab.Composite.ControlGroup;
import com.techlab.Composite.IHTML;

public class Test {

	public static void main(String[] args) throws IOException {

		ArrayList<IHTML> controls = new ArrayList<IHTML>();

		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");
		ControlGroup p = new ControlGroup("p");

		html.addControls(body);
		body.addControls(div);
		div.addControls(p);

		p.addControls(new Control("input", "text", "FirstName"));
		p.addControls(new ControlGroup("br"));

		p.addControls(new Control("input", "text", "Pasword"));
		p.addControls(new ControlGroup("br"));

		p.addControls(new Control("input", "Submit", "Login"));
		p.addControls(new ControlGroup("br"));

		StringBuilder sb = html.parseHTML();

		File file = new File("src/resource/htmlTest.html");

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(sb.toString());
		}
	}
}
