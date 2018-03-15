package polymorphism;

public class Truck extends Vehicle{
	static String maxLoad;
	
	public Truck(int vehicleID, int year, String price, String model, String color) {
		super(vehicleID, year, price, model, color);
		// TODO Auto-generated constructor stub
	}
	
	public Truck(int vehicleID, int year, String price, String model, String color, String maxLoad) {
		super(vehicleID, year, price, model, color);
		this.maxLoad = maxLoad;
		// TODO Auto-generated constructor stub
	}

	public String getMaxLoad() {
		return maxLoad;
	}
	
	public void setMaxLoad(String maxLoad) {
		this.maxLoad = maxLoad;
	}
}
