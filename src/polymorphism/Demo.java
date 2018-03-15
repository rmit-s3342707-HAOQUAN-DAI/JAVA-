package polymorphism;

import java.util.ArrayList;

public class Demo {
	ArrayList<Vehicle> v = new ArrayList<Vehicle>();
	
	Saloon c1 = new Saloon(000001, 2011, "$40,000", "X3", "Gray");
	Saloon c2 = new Saloon(000002, 2013, "$41,500", "X3", "Blue");

	Truck t1 = new Truck(100001, 2015, "$91,500", "TypeII", "Black", "5T");
	Truck t2 = new Truck(100002, 2014, "$94,500", "TypeI", "Black", "4T");
	
	public void storeInfo() {
		v.add(c1);
		v.add(c2);
		v.add(t1);
		v.add(t2);
	}
	
	public void printArrayList(ArrayList<String> display) {
		for(int i = 0; i<=display.size(); i++) 
		{
			System.out.println(display.get(i));
		}
	}
}
