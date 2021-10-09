package com.motorcycledesignpattern.motorcycle;


public class Client {
	public static void main(String[] args) {
	       MotorCycle motorCycle = new MotorCycle();
	     
	           
	           MotorCycleDirector director = new MotorCycleDirector();

	           MotorCycleBuilder motorBuilder = new MotorCycle();
	           
	           // making a motorcycle
	           director.MotorCycleDirector(motorBuilder);
	           System.out.println("********************************************");
	           System.out.println("Motor Cycle Manufactured Successfully");
	           System.out.println("**********************************************");

	           MotorCycleContext motorCycleContext = new MotorCycleContext();

	           motorCycleContext.action();
	           motorCycleContext.setState(new GearState());
	           motorCycleContext.action();
	           motorCycleContext.setState(new HeadLightState());
	           motorCycleContext.action();
	           motorCycleContext.setState(new FuelState());
	           motorCycleContext.action();
	           motorCycleContext.setState(new StopState());
	           motorCycleContext.action();
	           
	           
	          
	          
	   }
}
