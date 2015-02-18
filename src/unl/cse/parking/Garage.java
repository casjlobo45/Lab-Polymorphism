package unl.cse.parking;

public class Garage {

	private final Vehicle stalls[];
	
	public Garage(int capacity) {
		stalls = new Vehicle[capacity];
	}
	
	/**
	 * "Parks" the vehicle in a stall if one is available.  Returns true if
	 * the vehicle was added successfully; false otherwise.
	 */
	public boolean addVehicle(Vehicle automobile) {
		//TODO: implement this method
		for(int i = 0; i<stalls.length;i++){
			if(stalls[i] == null){
				stalls[i] = automobile;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Remove the vehicle having the provided
	 * license plate number from the garage. The method returns
	 * the vehicle if it is found otherwise it returns null. 
	 */
	public Vehicle removeVehicle(Vehicle vehicle) {
		//TODO: implement this method
		for(int i = 0; i<stalls.length;i++){
			if(stalls[i] == vehicle){
				stalls[i] = null;
				return vehicle;
			}
		}
		return null;
	}
		
	/**
	 * Returns the maximum capacity of this Garage
	 */
	public int getCapacity() {
		return this.stalls.length;
	}
	
	/**
	 * Returns the number of empty stalls in the garage--the number of open
	 * spots
	 * @return
	 */
	public int getNumFreeSpots() {
		int freeSpots = 0;
		for(int i=0; i<stalls.length; i++) {
			if(stalls[i] == null) {
				freeSpots++;
			}
		}
		return freeSpots;
	}

	/**
	 * Simulates the passing of a day by adding a day in the garage to each vehicle
	 * in the garage.
	 * @return
	 */
	public void addDay() {
		//TODO: implement this
		for(int i=0; i<stalls.length; i++) {
			if(stalls[i] != null){
				stalls[i].setDays(stalls[i].getDays() + 1);
			}
		}
	}
	
	public void addDay(int numDays) {
		//TODO: optionally implement this as well
	}
	
	/**
	 * Displays the current "state" of the garage by printing out information about each
	 * stall
	 */
	public void displayReport() {
		
		System.out.println("Stall License Type Days Total Fee");
		for(int i=0; i<this.stalls.length; i++) {
			if(stalls[i] == null) {
				System.out.println(String.format("%3d EMPTY", (i+1)));
			} else {
				//TODO: You will need to modify these arguments to display the report correctly
				System.out.println(String.format("%3d %-10s %-11s %3d $%5.2f", (i+1), stalls[i].getLicense(), getType(stalls[i]), stalls[i].getDays(), getTotalFee(stalls[i])));
			}
		}
	}
	public String getType(Vehicle vehicle){
		String type;
		if(vehicle.getClass() == Motorbike.class){
			type = "Motorbike";
			return type;
		}else if(vehicle.getClass() == CompactCar.class){
			type = "Compact Car";
			return type;
		}else if(vehicle.getClass() == SUV.class){
			type = "SUV";
			return type;
		}
		return "You should not have gotten this answer....";
	}
	public double getTotalFee(Vehicle vehicle){
		double totalFee;
		if(vehicle.getClass() == Motorbike.class){
			if(vehicle.getDays() < 8){
				totalFee = vehicle.getDays() * 4;
				return totalFee;
			}else if(vehicle.getDays() > 7){
				totalFee = vehicle.getDays()*3;
				return totalFee;
			}
		}else if(vehicle.getClass() == CompactCar.class){
			if(vehicle.getDays() < 8){
				totalFee = vehicle.getDays() * 6;
				return totalFee;
			}else if(vehicle.getDays() > 7){
				totalFee = vehicle.getDays()*4.5;
				return totalFee;
			}
		}else if(vehicle.getClass() == SUV.class){
			if(vehicle.getDays() < 8){
				totalFee = vehicle.getDays() * 8;
				return totalFee;
			}else if(vehicle.getDays() > 7){
				totalFee = vehicle.getDays()*6;
				return totalFee;
			}
		}
		return 0;
	}
}
