package com.luv2code.mypractice;

public class Toyota implements Cars {
	
	public CarDetails carDetails;

	public Toyota(CarDetails carDetails) {
		super();
		this.carDetails = carDetails;
	}

	@Override
	public String getStart() {
		// TODO Auto-generated method stub
		return "Toyota Started";
	}

	@Override
	public String getStop() {
		// TODO Auto-generated method stub
		return "Toyota Stopped";
	}

	@Override
	public String getCarDetails() {
		return carDetails.getCarDetails() + " for Toyota";
	}

	
}
