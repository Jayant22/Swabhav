package com.techlab.emotionable;

public class Man implements IEmotionable, ISocializable {

	@Override
	public void wish() {
		System.out.println("Hello Everyone");
	}

	@Override
	public void depart() {
		System.out.println("Bye Everyone");
	}

	@Override
	public void cry() {
		System.out.println("Im Crying");
	}

	@Override
	public void laugh() {
		System.out.println("Im Laughing");
	}
}
