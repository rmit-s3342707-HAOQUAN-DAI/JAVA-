package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	static ArrayList<Vehicle> v = new ArrayList<Vehicle>();
	
	static Saloon c1 = new Saloon(000001, 2011, "$40,000", "X3", "Gray");
	//static Saloon c2 = new Saloon(000002, 2013, "$41,500", "X3", "Blue");
	//static Truck t1 = new Truck(100001, 2015, "$91,500", "TypeII", "Black", "5T");
	//static Truck t2 = new Truck(100002, 2014, "$94,500", "TypeI", "Black", "4T");
	
//	public static void storeInfo() {
//		v.add(c1);
//		v.add(c2);
//		v.add(t1);
//		v.add(t2);
//		
//		//System.out.println(c1.vehicleID + "..." +c1.year);
//	}
	

	public static void main(String[] args) {
//		v.add("Bob");
//		v.add("George");
//		v.add("Steve");
//		v.add("James");
//		printArrayList(v);

		v.add(c1);
		v.add(new Saloon(000002, 2013, "$41,500", "X3", "Blue"));
		//v.add(t1);
		//v.add(t2);
		
		for(int i=0;i<v.size();i++) 
		{
			System.out.println(v.get(i));
		}
		
		System.out.print(c1);
		
		
//		for(Vehicle vehicle:v) {
//			//System.out.println(v);
//			System.out.printf("%06d%6d%10s%8s%6s%6s%n", 
//					Vehicle.vehicleID,Vehicle.year,Vehicle.price,Vehicle.model,Vehicle.color,Truck.maxLoad);
//
//		}
		
		
//		Iterator<Vehicle> list = v.iterator();
//		while(list.hasNext()) 
//		{
//			System.out.printf("%06d%6d%10s%5s%6s%6s%n", 
//					Vehicle.vehicleID,Vehicle.year,Vehicle.price,Vehicle.model,Vehicle.color,Truck.maxLoad);
//		}
		
			
			//printArrayList(v.size());
			

	}
	

	
	public static void printArrayList(ArrayList<Vehicle> A) {
		for(int i = 0; i<=A.size(); i++) 
		{
			System.out.println(A.get(i));
		}
	}
}
