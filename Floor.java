package HW2;


/*
 * This class represents the Floor of an elevator and all the functions that occurs with a floor and elevator. 
 */
public enum Floor {
	
	FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH, TENTH;
	
	private int currentFloor;
	private boolean hasOrders;
	private int queuedPassengers;
	private int num;
	private String name;
	
	Floor(){
		this.name = this.name();
		this.num = this.ordinal() + 1;
		
		
	}
	
	public int floorNumber() {
		return num;
	}
	
	public String floorName() {
		return name;
	}
	
	
	
	
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public void clearOrders() {
		this.hasOrders = false;
	}
	
	public void giveOrders() {
		this.hasOrders = true;
	}
	
	public int queuedPassengers() {
		return queuedPassengers;
	}
	
	public void addPassenger() {
		queuedPassengers++;
	}
	
	public void clearPassengers() {
		queuedPassengers = 0;
	}
	
	public boolean hasOrders() {
		return hasOrders;
	}
	
	/*
	 * https://github.com/bketelsen/harvard/blob/master/cscie160/hw1/Elevator.java
	 */
	public Floor goUp() {
		Floor input = Floor.FIRST;
		switch(num) {
		case 1: input = Floor.SECOND;
			break;
		case 2: input = Floor.THIRD;
			break;
		case 3: input = Floor.FOURTH;
			break;
		case 4: input = Floor.FIFTH;
			break;
		case 5: input = Floor.SIXTH;
			break;
		case 6: input = Floor.SEVENTH;
			break;
		case 7: input = Floor.EIGHTH;
			break;
		case 8: input = Floor.NINTH;
			break;
		case 9: input = Floor.TENTH;
			break;
			
		}
		return input;
	}
	
	/*
	 * https://github.com/bketelsen/harvard/blob/master/cscie160/hw1/Elevator.java
	 */
	public Floor goDown() {
		Floor input = Floor.FIRST;
		switch(num) {
		
		case 2: input = Floor.FIRST;
			break;
		case 3: input = Floor.SECOND;
			break;
		case 4: input = Floor.THIRD;
			break;
		case 5: input = Floor.FOURTH;
			break;
		case 6: input = Floor.FIFTH;
			break;
		case 7: input = Floor.SIXTH;
			break;
		case 8: input = Floor.SEVENTH;
			break;
		case 9: input = Floor.EIGHTH;
			break;
		case 10: input = Floor.NINTH;
			break;
			
		}
		return input;
	}
	
	
	
	
	

}
