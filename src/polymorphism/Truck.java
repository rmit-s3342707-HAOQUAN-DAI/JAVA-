package polymorphism;

public class Truck extends Vehicle{
	private String maxLoad;
	
	public Truck(String vehicleType, int year, String price, String model, String color) {
		super(vehicleType, year, price, model, color);
		// TODO Auto-generated constructor stub
	}
	
	public Truck(String vehicleType, int year, String price, String model, String color, String maxLoad) {
		super(vehicleType, year, price, model, color);
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
