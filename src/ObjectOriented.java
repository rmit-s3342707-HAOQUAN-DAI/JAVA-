import java.util.ArrayList;

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
	static ArrayList<String> list = new ArrayList<String>();

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
		list.add("Bob");

	}
	
	public static void show(car e) 
	{
		e.wheelnumber = 4;
		e.carcolor = "gold";
		System.out.println(e.wheelnumber+" "+e.carcolor);
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
	
	
	

	
	
	
	
	
	
	
	
	
	