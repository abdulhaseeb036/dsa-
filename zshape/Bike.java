package zshape;

public class Bike extends Vehicle {
private boolean suspension;
public Bike(){
super();
}
public Bike(String name ,String model, String color, int numOfWheels, boolean suspension){
super(name, model, color, numOfWheels, "not available"); //
this.suspension = suspension;
}

	// getter
	public boolean getSuspension() {
		return suspension;
	}
//setter
public void setSuspension(){
this.suspension=suspension;
}
//method
public void printBikeDetails(){
super.printDetails();
System.out.println("Does this bike have suspension ?? " + this.suspension);
}
}