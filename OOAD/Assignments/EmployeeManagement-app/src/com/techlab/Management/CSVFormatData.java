package com.techlab.Management;

import java.io.*;

public class CSVFormatData implements IEmployeeDataLoadable{

	private static final String FILENAME = "src/resource/dataFile_emp.txt";
	
	@Override
	public InputStream RetriveEmployeeData() throws IOException {
		
		File file = new File(FILENAME);
	    InputStream Stream = new FileInputStream(file);
		return Stream;
	}
}
