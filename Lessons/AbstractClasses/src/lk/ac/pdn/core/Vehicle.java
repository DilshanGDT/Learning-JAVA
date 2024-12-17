package lk.ac.pdn.core;

public abstract class Vehicle {

	private int speed = 10;
	private int gear = 0;
	protected boolean engineStatus = false;
	

	public Vehicle() {
		
	}
	
	public abstract void startEngine();	//abstract method
	public abstract void applyBrake(); 
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	} 
}
