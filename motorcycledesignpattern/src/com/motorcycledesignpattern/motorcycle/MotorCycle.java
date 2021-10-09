package com.motorcycledesignpattern.motorcycle;

public class MotorCycle implements MotorCycleBuilder {
	
	GearState gearState;
	HeadLightState lightState;

	   
      
	   
	   
	   @Override
	    public void buildBody() {
	        System.out.println("This is a body of a motorcycle");
	    }

	    @Override
	    public void insertWheels() {
	    	System.out.println("2 wheels are added");
	    }

	    @Override
	    public void addHeadlights() {
	    	System.out.println("1 headlight has been added");
	    }
		@Override
		public void handles() {
			System.out.println("Handles has been added");
			
		}

	    
	  
}
