package com.techlab.reflection;

import java.lang.reflect.*;
import com.techlab.person.Person;

public class Reflection {

	public static void main(String[] args) {

		Class<Person> obj = Person.class;

		printMethodInfo(obj);
		System.out.println();
		ConstructorInfo(obj);
		System.out.println();
		printGetterInfo(obj);
		System.out.println();
		printsetterInfo(obj);
		System.out.println();
		printPrivateVariables(obj);
		System.out.println();
		printPrivateMethods(obj);

	}

	private static void printPrivateMethods(Class<Person> obj) {
		Method[] privateStringMethod = obj.getDeclaredMethods();

		System.out.println("Classs Private Members::");
		for (int i = 0; i < privateStringMethod.length; i++) {
			
			privateStringMethod[i].setAccessible(true); 

			System.out.println(privateStringMethod[i]);

		}

	}

	private static void printPrivateVariables(Class<Person> obj) {

		Field[] privateStringField = obj.getDeclaredFields();

		System.out.println("Classs Private Members::");
		for (int i = 0; i < privateStringField.length; i++) {
			privateStringField[i].setAccessible(true);

			System.out.println(privateStringField[i]);

		}
	}

	private static void printsetterInfo(Class<Person> obj) {

		Method[] methods = obj.getMethods();

		System.out.println("Classs Setters::");

		for (int i = 0; i < methods.length; i++) {

			if (methods[i].toString().contains("set"))
				System.out.println(methods[i]);

		}

	}

	private static void printGetterInfo(Class<Person> obj) {

		Method[] methods = obj.getMethods();

		System.out.println("Classs Getters::");

		for (int i = 0; i < methods.length; i++) {

			if (methods[i].toString().contains("get"))
				System.out.println(methods[i]);

		}
	}

	private static void ConstructorInfo(Class<Person> obj) {

		Constructor[] constructors = obj.getConstructors();

		System.out.println("Class Constructors::");

		for (int i = 0; i < constructors.length; i++) {

			System.out.println(constructors[i]);

		}
	}

	private static void printMethodInfo(Class<Person> obj) {

		Method[] methods = obj.getMethods();

		System.out.println("Classs Methods::");

		for (int i = 0; i < methods.length; i++) {

			System.out.println(methods[i]);

		}
	}

}
