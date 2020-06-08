package com.techlab.Exception;

import java.io.*;

public class UncheckedException {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("src/com/techlab/Exception/Techlab.txt");
		BufferedReader fileInput = new BufferedReader(file);

		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());

		fileInput.close();
	}
}
