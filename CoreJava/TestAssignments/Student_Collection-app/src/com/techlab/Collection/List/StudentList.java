package com.techlab.Collection.List;

import java.io.*;
import java.util.*;

import com.techlab.Student.Collection.Student;

public class StudentList {
	
	public static void main(String[] args)  throws IOException{
		ArrayList<Student> students = new ArrayList<Student>();
		
		int choice = 0;

		do {
			System.out.println("\nArrayList Operations Demo: Student Demo");

			System.out.println("0 : Display Student list");
			System.out.println("1 : Add Student");
			System.out.println("2 : Remove Student");
			System.out.println("3 : Change Student");
			System.out.println("4 : Exit");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());

			String name;
			int roll_no;
			int position;

			switch(choice){
			case 0:
				System.out.println("\nStudents currently in ArrayList are " );
				for (Student student : students) {
					System.out.println(student.getName() + " " + student.getRoll_no());
				}
				break;
			case 1:
				System.out.println("Enter Student Name");
				name = br.readLine();
				System.out.println("Enter Student Roll_No");
				roll_no = Integer.parseInt(br.readLine());
				
				Student student = new Student(name,roll_no);
				students.add(student);
				break;
				
			case 2:
				System.out.println("Enter Student Index to remove");
				int index = Integer.parseInt(br.readLine());
				students.remove(index);
				break;
			case 3:
				
				System.out.println("Enter 1 to Update Name OR 0 to Update Roll_No");
				int ch = Integer.parseInt(br.readLine());
				if(ch==1) {
					System.out.println("Enter position in list");
					position = Integer.parseInt(br.readLine());
					System.out.println("Enter Student name");
					name = br.readLine();
					students.get(position).setName(name);
				}else {
					System.out.println("Enter position in list");
					position = Integer.parseInt(br.readLine());
					System.out.println("Enter Student Roll_No");
					roll_no = Integer.parseInt(br.readLine());
					students.get(position).setRoll_no(roll_no);
				}
				
				break;
			default:
				System.out.println("Exiting program");
				return;
			}

		}while(choice < 4 && choice >= 0);
	}
}

