package polymorphism;

public class Coupe extends Vehicle{
	private int topSpeed;
	public Coupe(int vehicleID, int year, String price, String model, String color) {
		super(vehicleID, year, price, model, color);
		// TODO Auto-generated constructor stub
	}
	
	public Coupe(int vehicleID, int year, String price, String model, String color, int topSpeed) {
		super(vehicleID, year, price, model, color);
		// TODO Auto-generated constructor stub
		this.topSpeed = topSpeed;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
}
