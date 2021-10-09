package com.motorcycledesignpattern.motorcycle;

 class GearState implements MotorCycleState  {
	
	
	@Override
	public void action(MotorCycleContext cycle) {
		
		System.out.println("Represents the State of Gear");
		
	}

}
