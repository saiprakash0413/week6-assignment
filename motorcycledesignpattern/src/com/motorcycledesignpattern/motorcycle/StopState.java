package com.motorcycledesignpattern.motorcycle;

public class StopState implements MotorCycleState {

	@Override
	public void action(MotorCycleContext cycle) {
		
		System.out.println("Motorcycle is stop state");
		
	}

}
