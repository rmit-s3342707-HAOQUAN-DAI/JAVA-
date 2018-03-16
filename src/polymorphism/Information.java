package polymorphism;

import java.util.ArrayList;

/*
 * 构造函数在对象创建时，就会调用与之对应的构造函数，对对象进行初始化
 * "static" 被static修饰，就被所有对象共享，称之为对象的共享数据，也可以被类名访问
 */

public class Information {
	static ArrayList<Vehicle> v = new ArrayList<Vehicle>();
	static ArrayList<Truck> t = new ArrayList<Truck>();
	
	static Saloon s1 = new Saloon(000001, 2011, "$40,000", "X3", "Gray");
	static Saloon s2 = new Saloon(000002, 2013, "$41,500", "X3", "Blue");
	static Saloon s3 = new Saloon(000003, 2014, "$51,500", "5S", "Black");
	static Truck t1 = new Truck(100001, 2015, "$91,500", "TypeII", "Black", "5T");
	static Truck t2 = new Truck(100002, 2014, "$94,500", "TypeI", "Black", "4T");
	static Truck t3 = new Truck(100003, 2016, "$134,999", "Max", "Black", "6T");
	static Saloon s4 = new Saloon(0, 0, null, null, null);
	
	private static ArrayList<Vehicle> setVehicleInfo()
	{
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		s4.setVehiclePrice("$6,666");
		s4.setVehicleID(000004);
		s3.setYear(2013);
		return v;
		
	}
	
	private static void setTruckInfo() 
	{
		t.add(t1);
		t.add(t2);
		t.add(t3);
	}
	
	
	public static void printInfo() 
	{
		setVehicleInfo();
		for(Vehicle vehicle:v) {
			System.out.printf("%06d%6d%9s%5s%10s%n", 
					vehicle.getVehicleID(),vehicle.getYear(),vehicle.getVehiclePrice(),vehicle.getVehicleModel(),vehicle.getVehicleColor());
		}
	} 
	
	public static void printTruckInfo() 
	{
		setTruckInfo();
		for(Truck truck:t) {
			System.out.printf("%06d%6d%9s%7s%8s%6s%n", 
					truck.getVehicleID(),truck.getYear(),truck.getVehiclePrice(),truck.getVehicleModel(),truck.getVehicleColor(),truck.getMaxLoad());
		}
	} 
	
	
}
