package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  "static" ��static���Σ��ͱ����ж�������֮Ϊ����Ĺ�������
 *  "static" �����ڶ�����ڣ���Ϊstatic�ĳ�Ա������ļ��ؾ��Ѿ�������
 *  "static" ����ֱ�ӱ��������ã���ʽΪ�� ����.��̬��Ա
 *  "static" ���ε������ǹ������ݣ������д��������������
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
		Person p = new Person("����", 16);
		p.speak();
		Person p1 = new Person("����");
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
