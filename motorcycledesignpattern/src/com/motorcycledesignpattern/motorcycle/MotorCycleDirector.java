package com.motorcycledesignpattern.motorcycle;

public class MotorCycleDirector {
	
	 MotorCycleBuilder myBuilder;

	    public void MotorCycleDirector(MotorCycleBuilder builder) {
	        myBuilder = builder;
	        myBuilder.buildBody();
	        myBuilder.insertWheels();
	        myBuilder.addHeadlights();
	        myBuilder.handles();
	    }

}
