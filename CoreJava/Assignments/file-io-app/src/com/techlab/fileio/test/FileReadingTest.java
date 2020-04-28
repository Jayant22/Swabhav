package com.techlab.fileio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingTest {

	public static void fetchFileData() {
		final String DELIMITER = ",";

		try {
			File file = new File("Student.csv");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] array = data.split(DELIMITER, -1);
				if (array[0].equals("")) { 
					System.out.println();
				} else {
					for (int j = 0; j < array.length; j++) {
						if (array[j] == null || array[j].length() == 0) {
							System.out.print("Unspecified ");
						} else
							System.out.print(array[j] + " ");
					}
					System.out.println();
				}
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		fetchFileData();

	}

}
