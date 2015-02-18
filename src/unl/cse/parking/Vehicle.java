package unl.cse.parking;

public class Vehicle {

	private final String license;	
	private int days;
	// The class constructor
	public Vehicle(String license, int days) {
		this.license = license;
		this.setDays(days);
	}
	
	/**
	 * The getter method granting public access to reading the
	 * license plate number. Notice license does not have a
	 * setter since it cannot be modified.
	 */
	public String getLicense() {
		return license;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	
}
