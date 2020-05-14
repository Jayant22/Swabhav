package com.techlab.fileio.test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LogFileTest {

	public static void fetchFileData(String flag) {

		try {
			File file = new File("db_app.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (flag == "null") {
					System.out.println(data);
				}
				if (data.contains(flag))
					System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String flag = "";
		if (args[0].equals("e")) {
			flag = "ERROR";
			fetchFileData(flag);
		}
		else if (args[0].equals("i")) {
			flag = "INFO";
			fetchFileData(flag);
		}
		else if (args[0].equals("w")) {
			flag = "WARNING";
			fetchFileData(flag);
		}
		else {
			flag  = "null";
			fetchFileData(flag);
		}

	}
}
