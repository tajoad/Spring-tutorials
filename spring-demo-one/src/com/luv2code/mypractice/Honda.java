package com.luv2code.mypractice;

public class Honda implements Cars{
	
	public CarDetails carDetails;
	

	public Honda(CarDetails carDetails) {
		super();
		this.carDetails = carDetails;
	}

	@Override
	public String getStart() {
		// TODO Auto-generated method stub
		return "Honda Started";
	}

	@Override
	public String getStop() {
		// TODO Auto-generated method stub
		return "Honda Stopped";
	}

	@Override
	public String getCarDetails() {
		return carDetails.getCarDetails() + " for Honda";
	}
	
	
}
