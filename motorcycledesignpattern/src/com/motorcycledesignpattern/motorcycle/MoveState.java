package com.motorcycledesignpattern.motorcycle;

public class MoveState implements MotorCycleState {

	@Override
	public void action(MotorCycleContext cycle) {
	
		System.out.println("motorcycle is started");
		
	}

}
