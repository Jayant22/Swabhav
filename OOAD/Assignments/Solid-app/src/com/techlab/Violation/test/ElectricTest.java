package com.techlab.Violation.test;

import com.techlab.Violation.ElectricPowerSwitch;
import com.techlab.Violation.LightBulb;

public class ElectricTest {

	public static void main(String[] args) {
		
		LightBulb bulb = new LightBulb();
		ElectricPowerSwitch electric = new ElectricPowerSwitch(bulb);
		
		electric.press();
		System.out.println(electric);

	}

}
