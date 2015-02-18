package unl.cse.parking;

public class GarageSimulation {
	public static void main(String[] args) {
		
		Garage safePark = new Garage(10);
		CompactCar ABC123 = new CompactCar("ABC 123", 0);
		SUV QEDNEB = new SUV("QED NEB", 0);
		safePark.addVehicle(ABC123);
		safePark.addVehicle(QEDNEB);
		safePark.addDay();//End of Sunday
		safePark.addDay();//End of Monday
		Motorbike XYZ321 = new Motorbike("XYZ 321", 0);
		safePark.addVehicle(XYZ321);
		safePark.addDay();//End of Tuesday
		Motorbike QT42 = new Motorbike("QT 42", 0);
		safePark.addVehicle(QT42);
		CompactCar FOO459 = new CompactCar("FOO 459", 0);
		safePark.addVehicle(FOO459);
		safePark.addDay();//End of Wednesday
		safePark.addDay();//End of Thursday
		safePark.removeVehicle(QT42);
		safePark.addDay();//End of Friday
		safePark.addDay();//End of Saturday
		safePark.displayReport();
		//End of week one
		safePark.removeVehicle(ABC123);
		safePark.addDay();//End of Sunday
		safePark.addDay();//End of Monday
		safePark.addDay();//End of Tuesday
		CompactCar BAR560 = new CompactCar("BAR 560", 0);
		safePark.addVehicle(BAR560);
		safePark.addDay();//End of Wednesday
		safePark.addDay();//End of Thursday
		safePark.addDay();//End of Friday
		safePark.addDay();//End of Saturday
		safePark.displayReport();
		//End of week two
		safePark.removeVehicle(QEDNEB);
		safePark.addDay();//End of Sunday
		safePark.addDay();//End of Monday
		SUV CSE444 = new SUV("CSE 444", 0);
		safePark.addVehicle(CSE444);
		safePark.addVehicle(QT42);
		safePark.addDay();//End of Tuesday
		safePark.addDay();//End of Wednesday
		safePark.addDay();//End of Thursday
		safePark.addDay();//End of Friday
		safePark.addDay();//End of Saturday
		safePark.displayReport();
		
	}
}
