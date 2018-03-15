package polymorphism;

public class Vehicle {
	private int vehicleID;
	private int year;
	private String price;
	private String model;
	private String color;
	
	
	public Vehicle (int vehicleID,int year,String price,String model,String color)
	{
		this.vehicleID = vehicleID;
		this.year = year;
		this.price = price;
		this.model = model;
		this.color = color;
	}
	
	
	public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getVehiclePrice() {
        return price;
    }

    public void setVehicleID(String price) {
        this.price = price;
    }
    
    public String getVehicleModel() {
        return model;
    }

    public void setVehicleModel(String model) {
        this.model = model;
    }
    
    public String getVehicleColor() {
    	return color;
    }
    
    public void setVehicleColor(String color) {
    	this.color = color;
    }
}
