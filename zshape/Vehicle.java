package zshape;

public class Vehicle {
	private String name;
	private String model;
	private String color;
	private int numOfWheels;
	private String transmission;

	public Vehicle() {
	}

	public Vehicle(String name, String model, String color, int numOfWheels, String transmission) {
		this.name = name;
		this.model = model;
		this.color = color;
		this.numOfWheels = numOfWheels;
		this.transmission = transmission;
	}

	public String getname() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int NumOfWheels() {
		return numOfWheels;
	}

	public String transmission() {
		return transmission;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public void printDetails() {
		System.out.println("\n");
		System.out.println("The Name of this vehicle is: " + this.name);
		System.out.println("The color of this vehicle is: " + this.color);
		System.out.println("The model of this vehicle is: " + this.model);
		System.out.println("The transmission for this vehicle is: " + this.transmission);
		System.out.println("The number of wheels in this vehicle is: " + this.numOfWheels);
	}
}





