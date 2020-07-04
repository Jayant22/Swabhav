package com.techlab.Management;

import java.io.*;
import java.util.*;

public class FileConvertion {

	IEmployeeDataLoadable load;

	public FileConvertion(IEmployeeDataLoadable load) {
		this.load = load;
	}

	public HashSet<Employee> FetchDataFromFile() throws IOException {

		HashSet<Employee> EmployeeList = new HashSet<Employee>();

		InputStream Stream = load.RetriveEmployeeData();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(Stream).useDelimiter(",");

		while (scanner.hasNext()) {
			String[] line = scanner.nextLine().split(",");
			
			EmployeeList.add(new Employee(line[0], line[1], line[2], line[3], line[4], Double.parseDouble(line[5]),
					line[6], Integer.parseInt(line[7])));
		}

		return EmployeeList;
	}
}
