package com.luv2code.mypractice;

public class CarSound implements Cars {
	
	public CarDetails carDetails;
	

	public CarSound() {
		System.out.println("constructor called");
	}
	

	public void setCarDetails(CarDetails carDetails) {
		System.out.println("Setter called");
		this.carDetails = carDetails;
	}



	@Override
	public String getStart() {
		// TODO Auto-generated method stub
		return "Car Started";
	}

	@Override
	public String getStop() {
		// TODO Auto-generated method stub
		return "Car Stopped";
	}

	@Override
	public String getCarDetails() {
		// Get car Details set
		return carDetails.getCarDetails();
	}

}
