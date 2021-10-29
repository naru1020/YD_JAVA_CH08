package com.yedam.java.ch02_02;

public class Driver {

	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus1 = (Bus) vehicle;
			bus1.checkFare();
		}
		vehicle.run();
	}
}
