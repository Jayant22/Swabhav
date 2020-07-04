package com.techlab.Management;

import java.net.*;
import java.io.*;

public class URLFormatData implements IEmployeeDataLoadable {

	private static final String FILENAME = "https://swabhav-tech.firebaseapp.com/emp.txt";

	@Override
	public InputStream RetriveEmployeeData() throws IOException {

		URL url = new URL(FILENAME);
		InputStream Stream = url.openStream();
		return Stream;
	}

}