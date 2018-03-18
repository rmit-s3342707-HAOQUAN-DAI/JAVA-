package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 *  "static" ��static���Σ��ͱ����ж�������֮Ϊ����Ĺ�������
 *  "static" �����ڶ�����ڣ���Ϊstatic�ĳ�Ա������ļ��ؾ��Ѿ�������
 *  "static" ����ֱ�ӱ��������ã���ʽΪ�� ����.��̬��Ա
 *  "static" ���ε������ǹ������ݣ������д��������������
 *  �Ƿ���static ���Σ��Ϳ�һ�㣬�ú��������Ƿ��з��ʵ������е���������
 *  ��Դ���뿴���ù����Ƿ���Ҫ���ʷǾ�̬�ĳ�Ա�����������Ҫ���ù��ܾ��ǷǾ�̬��
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
		
		
		
//		Person p = new Person("����", 16);
//		p.speak();
//		Person p1 = new Person("����");
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
