package com.techlab.Factory;

public class AutoMobileFactory {

	private static AutoMobileFactory factory = new AutoMobileFactory();

	private IAutoMobile audi = new Audi();
	private IAutoMobile tesla = new Tesla();
	private IAutoMobile bmw = new BMW();

	public static AutoMobileFactory getInstace() {

		if (factory == null) {
			// if instance is null, initialize
			factory = new AutoMobileFactory();
		}
		return factory;
	}

	public IAutoMobile getAutoMobile(AutoType autoMobiletype) {
		if (autoMobiletype == null) {
			return null;
		}
		if (autoMobiletype.equals(AutoType.AUDI)) {
			if (audi == null) {
				// if instance is null, initialize
				audi = new Audi();
			}
			return audi;

		} else if (autoMobiletype.equals(AutoType.TESLA)) {
			if (tesla == null) {
				// if instance is null, initialize
				tesla = new Tesla();
			}
			return audi;

		} else if (autoMobiletype.equals(AutoType.BMW)) {
			if (bmw == null) {
				// if instance is null, initialize
				bmw = new BMW();
			}
			return bmw;
		}
		return null;
	}
}
