package polymorphism;

public class Vehicle {
	private String vehicleType;
	private int year;
	private String price;
	private String model;
	private String color;
	
	
	public Vehicle (String vehicleType,int year,String price,String model,String color)
	{
		this.vehicleType = vehicleType;
		this.year = year;
		this.price = price;
		this.model = model;
		this.color = color;
	}
	
	
	
	public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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

    public void setVehiclePrice(String price) {
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
    
//    public String toString() 
//	{
//		return Vehicle.vehicleID +","+Vehicle.year +","+ Vehicle.price +","+ Vehicle.model +","+ Vehicle.color;
//	}
}
