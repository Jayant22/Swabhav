package com.techlab.Management.test;

import java.io.IOException;
import java.util.Map;

import com.techlab.Management.*;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {

		IEmployeeDataLoadable csv = new CSVFormatData();
		IEmployeeDataLoadable url = new URLFormatData();

		FileConvertion FileCSV = new FileConvertion(csv);
		FileConvertion FileURL = new FileConvertion(url);
		
		System.out.println("From Disk File:::\n");

		Employee employee = new Employee(FileCSV);

		Employee Test_Emp = employee.FindMaximumSalary();

		System.out.println(Test_Emp);

		System.out.println(
				"Size of Employee List After Removal of Duplicate values::" + employee.getEmployeeListSize() + "\n");

		Map<String, Integer> NoofEmpDept = employee.NoOfEMployeesInDepartment();

		for (Map.Entry<String, Integer> entry : NoofEmpDept.entrySet())
			System.out.println(entry.getKey() + " = " + entry.getValue());

		System.out.println();
		Map<String, Integer> NoofEmpDesig = employee.NoOfEMployeesInDesignation();

		for (Map.Entry<String, Integer> entry : NoofEmpDesig.entrySet())
			System.out.println(entry.getKey() + " = " + entry.getValue());

		System.out.println("\nFrom Url File:::\n");

		Employee employee1 = new Employee(FileURL);

		Employee Test_Emp1 = employee.FindMaximumSalary();

		System.out.println(Test_Emp1);

		System.out.println(
				"Size of Employee List After Removal of Duplicate values::" + employee.getEmployeeListSize() + "\n");

		Map<String, Integer> NoofEmpDept1 = employee1.NoOfEMployeesInDepartment();

		for (Map.Entry<String, Integer> entry : NoofEmpDept1.entrySet())
			System.out.println(entry.getKey() + " = " + entry.getValue());

		System.out.println();
		Map<String, Integer> NoofEmpDesig1 = employee1.NoOfEMployeesInDesignation();

		for (Map.Entry<String, Integer> entry : NoofEmpDesig1.entrySet())
			System.out.println(entry.getKey() + " = " + entry.getValue());

	}
}
