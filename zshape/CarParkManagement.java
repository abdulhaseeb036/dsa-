package zshape;

public class CarParkManagement {
    public void addVehicles(Car honda) {
    	System.out.println(honda);
    }
	
	public static void main(String[] args) {

		Car Honda = new Car("Civic", "Hatchback", "black", 4, "Auto", false);

		Bike RamliNainggolan = new Bike("KAWASAKI", "KX450F", "Green", 2, true);

		Car Toyota = new Car("Yaris", "GLI MT 1.3", "white", 4, "manual", true);
//		CarPark myCarPark = new CarPark();
		
//	---
		CarParkManagement myCarPark = new CarParkManagement();
//		---

//Parking Vehicles myCarPark.addVehicles();
		myCarPark.addVehicles(Honda);
//		myCarPark.addVehicles(RamliNainggolan);
//		myCarPark.addVehicles(Toyota);
// Comment some of the above to see if it works
//		System.out.println(" No. of Parked vehicles: " + myCarPark.numOfOccupiedSpots());
//		System.out.println("No. of Available Spots: " + myCarPark.numOfAvailableSpots());

// Printing details
		System.out.println("********** \n");
		System.out.println("List of All Parked Vehicles is as folows: ");
// myCarPark.printParkedvehiclesdetails();
	}
}
