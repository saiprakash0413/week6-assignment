package com.motorcycledesignpattern.motorcycle;

public class FuelState implements MotorCycleState {

	@Override
	public void action(MotorCycleContext cycle) {
		
		System.out.println("Fuel is Full");
		
	}

}
