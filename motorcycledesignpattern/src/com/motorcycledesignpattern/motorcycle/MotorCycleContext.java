package com.motorcycledesignpattern.motorcycle;

public class MotorCycleContext {
	
	private MotorCycleState motorState;
	
	public MotorCycleContext() {
		motorState=new MoveState();
	}
	
	 public void setState(MotorCycleState state) 
	    {
		 motorState = state;
	    }
	  
	    public void action() 
	    {
	    	motorState.action(this);
	    }
	
	
	

}
