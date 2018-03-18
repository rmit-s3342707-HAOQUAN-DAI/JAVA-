package polymorphism;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*
 * 构造函数在对象创建时，就会调用与之对应的构造函数，对对象进行初始化
 * "static" 被static修饰，就被所有对象共享，称之为对象的共享数据，也可以被类名访问
 */

public class Information {
	static ArrayList<Saloon> v = new ArrayList<Saloon>();
	static ArrayList<Saloon> saloonInfo = new ArrayList<Saloon>();
	static ArrayList<Truck> t = new ArrayList<Truck>();
	static ArrayList<Truck> truckInfo = new ArrayList<Truck>();
	static ArrayList<Saloon[]> allvehicle = new ArrayList<Saloon[]>();
	static int tempType,tempYear;
	static String tempPrice,tempModel,tempColor;
	static Saloon s1 = new Saloon("SALOON", 2011, "$40,000", "X3", "Gray");
	static Saloon s2 = new Saloon("SALOON", 2013, "$41,500", "X3", "Blue");
	static Saloon s3 = new Saloon("SALOON", 2014, "$51,500", "5S", "Black");
	static Truck t1 = new Truck("TRUCK", 2015, "$91,500", "TypeII", "Black", "5T");
	static Truck t2 = new Truck("TRUCK", 2014, "$94,500", "TypeI", "Black", "4T");
	static Truck t3 = new Truck("TRUCK", 2016, "$134,999", "Max", "Black", "6T");
	static Saloon s4 = new Saloon(null, 0, null, null, null);
	static Saloon temp = new Saloon("SALOON", 0, null, null, null);	
	
	static Scanner s = new Scanner(System.in);
	
	public static ArrayList<Saloon> setExitSaloonInfo()
	{
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		s4.setVehiclePrice("$6,666");
		s4.setVehicleType("Saloon");
		s3.setYear(2013);
		
		return v;	
	}
	
	public static void setTruckInfo() 
	{
		t.add(t1);
		t.add(t2);
		t.add(t3);
	}
	//
	public static void setSaloonInfo() throws IOException
	{

				//temp.setVehicleType("SALOON");
				System.out.println("Please enter vehicle year (eg.1999)");
				tempYear = s.nextInt();
				temp.setYear(tempYear);
				
				System.out.println("Please enter vehicle Price (eg.$40000)");
				tempPrice = s.next();
				temp.setVehiclePrice(tempPrice);
				
				System.out.println("Please enter vehicle Model (eg.X3)");
				tempModel = s.next();
				temp.setVehicleModel(tempModel);
				
				System.out.println("Please enter vehicle Color (eg.Black)");
				tempColor = s.next();
				temp.setVehicleColor(tempColor);

				v.add(temp);
				cloneInfo();
				//saloonInfo.addAll(v);
				//saloonInfo = (ArrayList<Saloon>) v.clone();
				
	}
	
	public static void cloneInfo() throws IOException 
	{
		setExitSaloonInfo();
		setTruckInfo();
		saloonInfo = (ArrayList<Saloon>) v.clone();
		truckInfo = (ArrayList<Truck>) t.clone();
	}
	
	

	
	public static void printSaloonInfo() 
	{
		//setExitSaloonInfo();
//		for(int i = 0;i<v.size();i++) 
//		{
//			System.out.printf("%06s%6d%9s%5s%10s%n", 
//					v.get(i));
//		}
		for(Saloon saloon:saloonInfo) {
			System.out.printf("%6s%6d%9s%5s%10s%n", 
					saloon.getVehicleType(),saloon.getYear(),saloon.getVehiclePrice(),saloon.getVehicleModel(),saloon.getVehicleColor());
		}
		v.clear();
	} 
	
	public static void printTruckInfo() 
	{
		//setTruckInfo();
		for(Truck truck:truckInfo) {
			System.out.printf("%6s%6d%9s%7s%8s%6s%n", 
					truck.getVehicleType(),truck.getYear(),truck.getVehiclePrice(),truck.getVehicleModel(),truck.getVehicleColor(),truck.getMaxLoad());
		}
		t.clear();
	} 
	
	
}
