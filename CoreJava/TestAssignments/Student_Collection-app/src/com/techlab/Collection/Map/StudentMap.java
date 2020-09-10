package com.techlab.Collection.Map;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import com.techlab.Student.Collection.Student;

public class StudentMap {

	public static void main(String[] args) throws IOException {

		HashMap<Integer, String> students = new HashMap<Integer, String>();

		int choice = 0;

		do {
			System.out.println("\nHashmap Operations Demo: Student Demo");

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
				System.out.println("\nPlayers currently in ArrayList are ");
				Iterator<Entry<Integer, String>> entries = students.entrySet().iterator();
				while (entries.hasNext()) {
					Entry<Integer, String> entry = entries.next();
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
				break;
			case 1:
				System.out.println("Enter Student Name");
				name = br.readLine();
				System.out.println("Enter Student Roll_No");
				roll_no = Integer.parseInt(br.readLine());

				Student student = new Student(name,roll_no);

				students.put(student.getRoll_no(), student.getName());
				break;
			case 2:
				System.out.println("Enter Student Key to remove");
				position = Integer.parseInt(br.readLine());
				students.remove(position);
				break;
				
			case 3:
				
				System.out.println("Enter 1 to Update Name OR 0 to Update Roll_No");
				int ch = Integer.parseInt(br.readLine());
				
				if(ch==1) {
					System.out.println("Enter Old Student Name");
					String oldName = br.readLine();
					System.out.println("Enter New Student name");
					String newName = br.readLine();
					
					System.out.println(students);
					
					Iterator<Entry<Integer, String>> update_entries = students.entrySet().iterator();
					while (update_entries.hasNext()) {
						Entry<Integer, String> entry = update_entries.next();
						System.out.println(entry);
						if (entry.getValue().equals(oldName)) {
							System.out.println(entry.getValue());
							int key = entry.getKey();
							students.remove(entry.getKey());
							students.put(key, newName);
						}
					}
					
				}else {
					System.out.println("Enter Old Student Roll_No");
					int oldRoll = Integer.parseInt(br.readLine());
					System.out.println("Enter New Student Roll_No");
					int newRoll = Integer.parseInt(br.readLine());
					
					Iterator<Entry<Integer, String>> update_entries = students.entrySet().iterator();
					while (update_entries.hasNext()) {
						Entry<Integer, String> entry = update_entries.next();
						if (entry.getKey() == oldRoll) {
							System.out.println(entry.getKey());
							students.put(newRoll, entry.getValue());
							students.remove(entry.getKey());
						}
					}
				}
				break;
				
			default:
				System.out.println("Exiting program");
				return;
			}

		} while (choice < 4 && choice >= 0);
	}	
}
