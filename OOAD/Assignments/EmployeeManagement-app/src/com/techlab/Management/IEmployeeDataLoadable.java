package com.techlab.Management;

import java.io.*;

public interface IEmployeeDataLoadable {
	
	public InputStream RetriveEmployeeData() throws IOException;
}
