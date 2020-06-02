package com.techlab.serialization.test;

import java.io.*;
import com.techlab.serialization.*;

class SerializationTest {

	public static void printdata(Serializations object1) {

		System.out.println("name = " + object1.getName());
		System.out.println("age = " + object1.getAge());
		System.out.println("a = " + object1.getA());
		System.out.println("b = " + Serializations.getB());
	}

	public static void main(String[] args) {
		Serializations object = new Serializations("Jayant", 20, 2, 1000);
		String filename = "Techlab.txt";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			printdata(object);

			Serializations.setB(2000);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		object = null;

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object = (Serializations) in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(object);

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}

}
