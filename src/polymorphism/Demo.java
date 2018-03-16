package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  "static" 被static修饰，就被所有对象共享，称之为对象的共享数据
 *  "static" 优先于对象存在，因为static的成员随着类的加载就已经存在了
 *  "static" 可以直接被类名调用，格式为： 类名.静态成员
 *  "static" 修饰的数据是共享数据，对象中储存的是特有数据
 */
public class Demo {
	static Saloon s4 = new Saloon(000004, 2011, "$40,000", "X3", "Gray");
	
	public static void main(String[] args) {

		//Information.printInfo();
		//Information.printTruckInfo();
		
//		Iterator<Vehicle> list = v.iterator();
//		while(list.hasNext()) 
//		{
//			System.out.printf("%06d%6d%10s%5s%6s%6s%n", 
//					Vehicle.getVehicleID(),Vehicle.year,Vehicle.price,Vehicle.model,Vehicle.color,Truck.maxLoad);
//		}
		Person p = new Person("旺财", 16);
		p.speak();
		Person p1 = new Person("胖胖");
		p1.speak();
		Person p3 = new Person("Pang",22,"OZ");
		p3.speak();
		p1.compare(p3);
		System.out.println(Person.country);

	}

	
	public static void printArrayList(ArrayList<Vehicle> A) {
		for(int i = 0; i<=A.size()-1; i++) 
		{
			System.out.println(A.get(i));
		}
	}
}
