package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class ElectricTest {

	public static void main(String[] args) {

		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();

		System.out.println(bulbPowerSwitch + "\n");

		Switchable switchableFan=new Fan();
	    Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
	    fanPowerSwitch.press();
	    fanPowerSwitch.press();
	    
	    System.out.println(fanPowerSwitch);
	}
}
