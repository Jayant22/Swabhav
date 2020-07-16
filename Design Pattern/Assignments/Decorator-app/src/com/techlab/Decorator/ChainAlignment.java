package com.techlab.Decorator;

public class ChainAlignment extends BikeService {

	private int alignmentCost = 100;

	public ChainAlignment(IBikeService service) {
		super(service);
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return service.getdescription() + "\nChain Alignment done: " + alignmentCost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return service.getCost() + alignmentCost;
	}

}
