package com.techlab.emotionable;

public class Boy implements IEmotionable {

	@Override
	public void cry() {
		System.out.println("Im Crying");
	}

	@Override
	public void laugh() {
		System.out.println("Im Laughing");
	}
}
