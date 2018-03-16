import java.util.ArrayList;

/*
 * 面向过程：对于面向过程，强调的是过程（动作） 比如 C语言
 * 举例：
 * 大象装进冰箱
 * 打开冰箱--》存储冰箱--》关上冰箱
 * 
 * 
 * 面向对象： C++  JAVA  C#
 * 面向对象思想，强调对象（实体）
 * 特点： 
 * 1：面向对象是一种常见的思想，符合人们的思考习惯
 * 2：面向对象的出现，将复杂的问题简单化
 * 3：让曾经在过程中的执行者，变成了对象中的指挥着
 * 
 * “打开 冰箱”，“存储大象”，“关闭冰箱” --> 这些功能都存储在冰箱里 -->冰箱封装了这些功能 -->如果找到冰箱，就找到了“打开”，“存储”，“关闭”的功能
 * 
 * 
 */

/*
 * 用java语言对现实生活中的事物进行描述，通过类的形式来实现
 * 对于事物描述通常只关注两方面，一个是属性，一个是行为类就是事物的描述，
 * 对象就是该事物的实例，在java中通过new来创建
 * 
 */
	
/*
 * 描述小汽车
 * 分析：
 * 1，属性：轮胎数量，颜色
 * 2，行为：运行
 * 
 */

public class ObjectOriented {
	 //在计算机中创建一个car的实例，通过new关键字
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) 
	{
		//new car(); //匿名对象，简写格式
		//new car().run(); //当对象方法仅进行一次调用，可以简化成匿名对象
		//show(new car());
		car c1 = new car(); // c就是一个类类型的变量，指向了该类的对象
		car c2 = c1;
		car c3 = new car();
		//c1.wheelnumber=4;
		//c1.carcolor="red";
		//c2.carcolor ="blue";
		show(c1);
		show(c3);
		//c1.run(); //运行. 要使用对象中的内容，可以通过 对象.成员 的形式来完成调用
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
 * 定义类就是在定义成员。
 * 成员分为成员变量（属性），成员函数（行为）
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
	
	
	

	
	
	
	
	
	
	
	
	
	