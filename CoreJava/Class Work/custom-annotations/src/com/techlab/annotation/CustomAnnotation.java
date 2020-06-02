package com.techlab.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {

	@RequiredRefactor
	public void greet() {
		System.out.println("Hello");
	}
	
	@RequiredRefactor
	public void go() {
		System.out.println("Bye");
	}

	@RequiredRefactor
	public void play() {
		System.out.println("Playing");
	}

	public void dance() {
		System.out.println("dancing");
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface RequiredRefactor {
	}

}
