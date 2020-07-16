package com.techlab.Decorator;

public class OilChange extends BikeService {

private int oilChangeCost = 150;
	
	public OilChange(IBikeService service) {
		super(service);
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return service.getdescription() + "\nOil Change done: " + oilChangeCost;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return service.getCost() + oilChangeCost;
	}

}
