package com.techlab.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import com.techlab.annotation.CustomAnnotation;

public class CustomAnnotationTest {

	public static void main(String[] args) {
	
		CustomAnnotation c = new CustomAnnotation();

		printNumberofAnnotations(c);

	}

	public static void printNumberofAnnotations(CustomAnnotation c) {

		int annotationsCount = 0;
		Method[] method = c.getClass().getDeclaredMethods();

		System.out.println("Name of methods which have annotations: ");
		for (Method m : method) {

			Annotation[] annot = m.getDeclaredAnnotations();
			for (Annotation a : annot) {
				annotationsCount++;
				System.out.println(a + " " + m.getName());
			}
		}
		System.out.println();
		System.out.println("Number of methods which has annotations: " + annotationsCount);

	}

}
