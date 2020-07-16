package com.techlab.Decorator;

public class BasicBikeService implements IBikeService {
	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return "Basic bike servicing: " + getCost();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 300;
	}

}
