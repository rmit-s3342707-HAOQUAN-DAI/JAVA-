import java.util.ArrayList;

import polymorphism.Saloon;
import polymorphism.Truck;
import polymorphism.Vehicle;

/*
 * ������̣�����������̣�ǿ�����ǹ��̣������� ���� C����
 * ������
 * ����װ������
 * �򿪱���--���洢����--�����ϱ���
 * 
 * 
 * ������� C++  JAVA  C#
 * �������˼�룬ǿ������ʵ�壩
 * �ص㣺 
 * 1�����������һ�ֳ�����˼�룬�������ǵ�˼��ϰ��
 * 2���������ĳ��֣������ӵ�����򵥻�
 * 3���������ڹ����е�ִ���ߣ�����˶����е�ָ����
 * 
 * ���� ���䡱�����洢���󡱣����رձ��䡱 --> ��Щ���ܶ��洢�ڱ����� -->�����װ����Щ���� -->����ҵ����䣬���ҵ��ˡ��򿪡������洢�������رա��Ĺ���
 * 
 * 
 */

/*
 * ��java���Զ���ʵ�����е��������������ͨ�������ʽ��ʵ��
 * ������������ͨ��ֻ��ע�����棬һ�������ԣ�һ������Ϊ����������������
 * ������Ǹ������ʵ������java��ͨ��new������
 * 
 */
	
/*
 * ����С����
 * ������
 * 1�����ԣ���̥��������ɫ
 * 2����Ϊ������
 * 
 */

public class ObjectOriented {
	//�ڼ�����д���һ��car��ʵ����ͨ��new�ؼ���
	
	public static void main(String[] args) 
	{
		//new car(); //�������󣬼�д��ʽ
		//new car().run(); //�����󷽷�������һ�ε��ã����Լ򻯳���������
		//show(new car());
		car c1 = new car(); // c����һ�������͵ı�����ָ���˸���Ķ���
		car c2 = c1;
		car c3 = new car();
		//c1.wheelnumber=4;
		//c1.carcolor="red";
		//c2.carcolor ="blue";
		show(c1);
		show(c3);
		//c1.run(); //����. Ҫʹ�ö����е����ݣ�����ͨ�� ����.��Ա ����ʽ����ɵ���
		printArrayList(v);

	}
	
	public static void show(car e) 
	{
		e.wheelnumber = 4;
		e.carcolor = "gold";
		System.out.println(e.wheelnumber+" "+e.carcolor);
	}
	
static ArrayList<Vehicle> v = new ArrayList<Vehicle>();
	
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

/*
 * ����������ڶ����Ա��
 * ��Ա��Ϊ��Ա���������ԣ�����Ա��������Ϊ��
 */
	class car
	{
		int wheelnumber;
		String carcolor;
		
		void run() 
		{
			System.out.println(wheelnumber+" "+carcolor);
		}
	}
	
	

	
	
	
	
	
	
	
	
	
	