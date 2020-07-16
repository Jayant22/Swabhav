package com.techlab.Decorator;

public abstract class BikeService implements IBikeService {

	protected IBikeService service;

	public BikeService(IBikeService service) {
		super();
		this.service = service;
	}

	@Override
	public int getCost() {
		return service.getCost();
	}

}
