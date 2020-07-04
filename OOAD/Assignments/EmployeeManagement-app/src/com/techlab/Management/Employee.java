package com.techlab.Management;

import java.io.IOException;
import java.util.*;

public class Employee {

	private String EmployeeId;
	private String EmployeeName;
	private String Employee_Designation;
	private String ManagerId;
	private String Date_Of_Joining;
	private double Salary;
	private String Commission;
	private int Department_Number;

	private FileConvertion convert;
	private HashSet<Employee> EmployeeList = new HashSet<Employee>();

	public Employee(String employeeId, String employeeName, String employee_Designation, String managerId,
			String date_Of_Joining, double salary, String commission, int department_Number) {
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Employee_Designation = employee_Designation;
		ManagerId = managerId;
		Date_Of_Joining = date_Of_Joining;
		Salary = salary;
		Commission = commission;
		Department_Number = department_Number;
	}

	public Employee(FileConvertion convert) throws IOException {
		this.convert = convert;
		EmployeeList = setEmployeeList();
	}

	public HashSet<Employee> setEmployeeList() throws IOException {
		HashSet<Employee> EmployeeList = new HashSet<Employee>();
		EmployeeList = convert.FetchDataFromFile();
		return EmployeeList;
	}

	public Employee FindMaximumSalary() {

		double maxValue = Integer.MIN_VALUE;
		Employee Emp = null;
		for (Employee employee : EmployeeList) {
			if (employee.getSalary() > maxValue) {
				maxValue = employee.getSalary();
				Emp = employee;
			}
		}
		return Emp;
	}

	public Map<String, Integer> NoOfEMployeesInDepartment() {

		int count_10 = 0, count_20 = 0, count_30 = 0;
		final int DEPT_NO_10 = 10, DEPT_NO_20 = 20;
		for (Employee employee : EmployeeList) {
			if (employee.getDepartment_Number() == DEPT_NO_10) {
				count_10++;
			} else if (employee.getDepartment_Number() == DEPT_NO_20) {
				count_20++;
			} else {
				count_30++;
			}
		}

		final int c1 = count_10, c2 = count_20, c3 = count_30;

		@SuppressWarnings("serial")
		Map<String, Integer> values = new HashMap<String, Integer>() {
			{
				put("Dept_No_10", c1);
				put("Dept_No_20", c2);
				put("Dept_No_30", c3);
			}
		};

		return values;
	}

	public Map<String, Integer> NoOfEMployeesInDesignation() {

		int count_of_manager = 0, count_of_clerk = 0, count_of_analyst = 0, count_of_salesmamn = 0,
				count_of_President = 0;

		for (Employee employee : EmployeeList) {
			if ("'MANAGER'".equals(employee.getEmployee_Designation()))
				count_of_manager++;
			else if ("'CLERK'".equals(employee.getEmployee_Designation()))
				count_of_clerk++;
			else if ("'ANALYST'".equals(employee.getEmployee_Designation()))
				count_of_analyst++;
			else if ("'SALESMAN'".equals(employee.getEmployee_Designation()))
				count_of_salesmamn++;
			else
				count_of_President++;
		}

		final int c1 = count_of_manager, c2 = count_of_clerk, c3 = count_of_analyst, c4 = count_of_salesmamn,
				c5 = count_of_President;

		@SuppressWarnings("serial")
		Map<String, Integer> values = new HashMap<String, Integer>() {
			{
				put("MANAGER", c1);
				put("CLERK", c2);
				put("ANALYST", c3);
				put("SALESMAN", c4);
				put("PRESIDENT", c5);
			}
		};

		return values;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public String getEmployee_Designation() {
		return Employee_Designation;
	}

	public String getManagerId() {
		return ManagerId;
	}

	public String getDate_Of_Joining() {
		return Date_Of_Joining;
	}

	public double getSalary() {
		return Salary;
	}

	public String getCommission() {
		return Commission;
	}

	public int getDepartment_Number() {
		return Department_Number;
	}
	
	public int getEmployeeListSize() {
		return EmployeeList.size();
	}

	@Override
	public boolean equals(Object obj) {
		return !super.equals(obj);
	}

	public int hashCode() {
		return getEmployeeId().hashCode();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee id:: ").append(this.EmployeeId).append("\n");
		sb.append("Employee name:: ").append(this.EmployeeName).append("\n");
		sb.append("Employee designation:: ").append(this.Employee_Designation).append("\n");
		sb.append("Manager Id:: ").append(this.ManagerId).append("\n");
		sb.append("Date of joining:: ").append(this.Date_Of_Joining).append("\n");
		sb.append("Salary:: ").append(this.Salary).append("\n");
		sb.append("Commission:: ").append(this.Commission).append("\n");
		sb.append("Department Number:: ").append(this.Department_Number).append("\n");

		return sb.toString();
	}
}
