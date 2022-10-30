package HW2;

import java.util.Map;

/*
 * This class operates various methods to emulate the same functions of a regular elevator. An elevator's 
 * main function is to transport passengers from one floor to another. This elevator has the ability to travel between
 * 10 floors with a maximum capacity of 20 passengers and 3500 lbs of weight. 
 * Inspired by and credited to: https://github.com/bketelsen/harvard/blob/47ef303d65e3c295a96d5cd31c0a0efd442bfb88/cscie160/hw1/Elevator.java
 * 
 */
public class Elevator {
	
	private static final int MAX_CAPACITY = 20;
	private static final double MAX_CARGO = 3500;
	private static final int NUM_FLOORS = 10;
	
	private int numPassengers;
	private int currentWeight;
	private Floor currentFloor;
	private Direction currentDirection;
	private int elevatorOccupancy;
	
	public Elevator() {
		currentFloor = Floor.FIRST;
		numPassengers = 0;
		currentDirection = Direction.UP;
		
	}
	
	
	
	public void board(int floor) {
		elevatorOccupancy++;
		switch(floor) {
			case 1:	Floor.FIRST.giveOrders();
				Floor.FIRST.addPassenger();
				break;
			case 2: Floor.SECOND.giveOrders();
				Floor.SECOND.addPassenger();
				break;
			case 3: Floor.THIRD.giveOrders();
				Floor.THIRD.addPassenger();
				break;
			case 4: Floor.FOURTH.giveOrders();
				Floor.FOURTH.addPassenger();
				break;
			case 5: Floor.FIFTH.giveOrders();
				Floor.FIFTH.addPassenger();
				break;
			case 6: Floor.SIXTH.giveOrders();
				Floor.SIXTH.addPassenger();
				break;
			case 7: Floor.SEVENTH.giveOrders();
				Floor.SEVENTH.addPassenger();
				break;
			case 8: Floor.EIGHTH.giveOrders();
				Floor.EIGHTH.addPassenger();
				break;
			case 9: Floor.NINTH.giveOrders();
				Floor.NINTH.addPassenger();
				break;
			case 10: Floor.TENTH.giveOrders();
				Floor.TENTH.addPassenger();
				break;
		}
	}
	
	public void go() {
		if(currentFloor == Floor.FIRST) {
			currentDirection = Direction.UP;
		}
		
		if(currentFloor == Floor.TENTH) {
			currentDirection = Direction.DOWN;
		}
		
		if(currentDirection == Direction.UP) {
			currentFloor = currentFloor.goUp();
		} 
		else if(currentDirection == Direction.DOWN) {
			currentFloor = currentFloor.goDown();
		}
		
		if(currentFloor.hasOrders()) {
			stop();
		}
	}
	
	public void stop() {
		System.out.println("Stopped at " + currentFloor.floorName() + " floor");
		currentFloor.clearOrders();
		elevatorOccupancy = elevatorOccupancy - currentFloor.queuedPassengers();
		currentFloor.clearPassengers();
		System.out.println(this);
	}
	
	 @Override
	    public String toString() {
		 return "Elevator Occupancy: " + elevatorOccupancy + " \r\n" + "On " + currentFloor + " floor.\r\n";

	    }
	
	
	
	/*
	 * Returns the total cargo weight (in lbs) on the elevator; 
	 */
//	public int getCurrentWeight() {
//		int total = 0;
//		for(Passenger person: cargo.keySet()) {
//			total += cargo.get(person);
//		}
//		return total;
//	
//	}
	
	

}
