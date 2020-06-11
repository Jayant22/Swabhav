package com.techlab.college.test;

import java.util.*;

import com.techlab.college.*;

public class CollegeTest {

	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student(1, "abc", "12/06/1998", "Solapur");
		Student s2 = new Student(2, "acd", "13/07/1999", "Pune");
		Student s3 = new Student(3, "abe", "14/08/1998", "Mumbai");
		Student s4 = new Student(4, "pqr", "15/09/1999", "Solapur");
		Student s5 = new Student(5, "pqs", "16/10/1998", "Pune");
		Student s6 = new Student(6, "pqt", "17/11/1999", "Mumbai");

		List<Student> department1 = new ArrayList<Student>();
		department1.add(s1);
		department1.add(s2);
		List<Student> department2 = new ArrayList<Student>();
		department2.add(s3);
		department2.add(s4);
		List<Student> department3 = new ArrayList<Student>();
		department3.add(s5);
		department3.add(s6);
		
		Department Department1 = new Department(1,"CSE",department1);
		Department Department2 = new Department(2,"MECH",department2);
		Department Department3 = new Department(3,"ENTC",department3);
		
		List<Department> DeptList = new ArrayList<Department>();
		DeptList.add(Department1);
		DeptList.add(Department2);
		DeptList.add(Department3);
		
		College college = new College(1,"NKOCET",DeptList);
		
		System.out.println(college);
		
		/*List<Department> departments = college.getDepartments();
		
		
		 * System.out.println("Details Of the College::");
		 * System.out.println("College Id:: " + college.getCollegeID());
		 * System.out.println("College Name:: " + college.getCollegeName());
		 * System.out.println("College Departments:: ");
		 
		
		for (Department department : departments) {
			
			 * System.out.println("Department Id:: " + department.getDeptId());
			 * System.out.println("Department Name:: " + department.getDeptName());
			 
			
			List<Student> students = department.getStudents();
			
			for (Student student : students) {
				System.out.println("Student Id:: " + student.getStudId());
				System.out.println("Student Name:: " + student.getStudName());
				System.out.println("Student DOB:: " + student.getDateOfBirth());
				System.out.println("Student Address:: " + student.getAddress());
				System.out.println(student);
			}
		}*/
		
	}

}
