package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 *  "static" 被static修饰，就被所有对象共享，称之为对象的共享数据
 *  "static" 优先于对象存在，因为static的成员随着类的加载就已经存在了
 *  "static" 可以直接被类名调用，格式为： 类名.静态成员
 *  "static" 修饰的数据是共享数据，对象中储存的是特有数据
 *  是否用static 修饰，就看一点，该函数功能是否有访问到对象中的特有数据
 *  从源代码看，该功能是否需要访问非静态的成员变量，如果需要，该功能就是非静态的
 *  
 */
public class Demo {
	static Saloon s4 = new Saloon("SALOON", 2011, "$40,000", "X3", "Gray");
	static Scanner s = new Scanner(System.in);
	static int person;
	static int submenu;
	public static void main(String[] args) {
		

		iniSystem();

		
//		Iterator<Vehicle> list = v.iterator();
//		while(list.hasNext()) 
//		{
//			System.out.printf("%06d%6d%10s%5s%6s%6s%n", 
//					Vehicle.getVehicleID(),Vehicle.year,Vehicle.price,Vehicle.model,Vehicle.color,Truck.maxLoad);
//		}
		
		
		
//		Person p = new Person("旺财", 16);
//		p.speak();
//		Person p1 = new Person("胖胖");
//		p1.speak();
//		Person p3 = new Person("Pang",22,"OZ");
//		p3.speak();
//		p1.compare(p3);
//		System.out.println(Person.country);

	}
	public static void iniSystem() 
	{
		Information.setExitSaloonInfo();
		Information.setTruckInfo();
		Information.cloneInfo();
		start();
		menu();
	}
	
	public static void loadData() 
	{
		
		
	}
	
	public static void start() 
	{
		System.out.println("Welcome to Vechile information system");
		System.out.println("Please select from below:");
		System.out.println("1 to veiw information");
		System.out.println("2 to add new information");
		System.out.println("0 to exit");
		System.out.println("----------------------------------------");
		person = s.nextInt();
	}
	
	public static void menu()
	{
		
		if (person ==1)
		{
			System.out.println("Saloon Information:");
			Information.printSaloonInfo();
			System.out.println("Truck Information");
			Information.printTruckInfo();
			start();
			menu();
		}
		else if (person ==2) 
		{
			do
				{
				subMenu();	
				
				}while(submenu==1);
			start();
			menu();
		}
		else if (person ==0)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Error, start again.");
			iniSystem();
		}
	}
	
	public static void subMenu() 
	{
		Information.setSaloonInfo();
		System.out.println("added.want to continue? 1 for yes, 2 for no");
		submenu = s.nextInt();	
	}

	public static void printArrayList(ArrayList<Vehicle> A) {
		for(int i = 0; i<=A.size()-1; i++) 
		{
			System.out.println(A.get(i));
		}
	}
}
