package com.motorcycledesignpattern.motorcycle;

 class HeadLightState implements MotorCycleState {

	@Override
	public void action(MotorCycleContext cycle) {
		
		System.out.println("HeadLight is ON");
		
	}
	
	
}
