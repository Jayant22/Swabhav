package com.techlab.emotionable.test;

import com.techlab.emotionable.Boy;
import com.techlab.emotionable.IEmotionable;
import com.techlab.emotionable.ISocializable;
import com.techlab.emotionable.Man;

public class IEmotionableTest {

	public static void main(String[] args) {
		
		Man m = new Man();
		
		System.out.println("Man At Party::");
		atTheParty(m,m);
		System.out.println("Man At Movie::");
		atTheMovie(m);

		Boy b = new Boy();

		System.out.println("Bot At Movie::");
		atTheMovie(b);
	}

	private static void atTheParty(ISocializable S,IEmotionable E) {
		
		S.wish();
		S.depart();
		E.cry();
		E.laugh();
	}
	private static void atTheMovie(IEmotionable E) {
		
		E.cry();
		E.laugh();
	}

	
}
