package com.techlab.Collection.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;

import com.techlab.Student.Collection.Student;

public class StudentSet {

	public static void main(String[] args)  throws IOException{
		
		HashSet<Student> students = new HashSet<Student>();

		int choice = 0;

		do {
			System.out.println("\nHashset Operations Demo: Student Demo");

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
				int Index = 0;
				System.out.println("Enter Student Index to remove");
				position = Integer.parseInt(br.readLine());
				for (Student stud : students) {
					if(Index == position){
						students.remove(stud);
				        break;
				    }
					Index++;
				}
				break;
			case 3:
				
				int currentIndex = 0;
				System.out.println("Enter 1 to Update Name OR 0 to Update Roll_No");
				int ch = Integer.parseInt(br.readLine());
				if(ch==1) {
					System.out.println("Enter position in list");
					position = Integer.parseInt(br.readLine());
					System.out.println("Enter Student name");
					name = br.readLine();
					for (Student stud : students) {
						if(currentIndex == position){
					        stud.setName(name);
					        break;
					    }
						currentIndex++;
					}
				}else {
					System.out.println("Enter position in list");
					position = Integer.parseInt(br.readLine());
					System.out.println("Enter Student Roll_No");
					roll_no = Integer.parseInt(br.readLine());
					for (Student stud : students) {
						if(currentIndex == position){
					        stud.setRoll_no(roll_no);
					        break;
					    }
						currentIndex++;
					}
				}

				break;
			default:
				System.out.println("Exiting program");
				return;
			}

		}while(choice < 4 && choice >= 0);
	}
}
