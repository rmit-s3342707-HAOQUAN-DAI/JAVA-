/*
 * 
 * 定义函数的格式
 * 修饰符      返回值类型     函数名 （参数类型   形式参数1，参数类型，形式参数2,.....）
 * 『
 * 		执行语句
 * 		return 返回值
 * 』
 * 
 * 
 * 
 */

public class OverLoad {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	
	public static void printTable(int num) {
		for(int x=1;x<=num;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(y +"*"+ x + "=" + y*x+ "\t" );
			}
			System.out.println();
		}
		
	}
	
	public static void printTable() {
		printTable(9);
//		for(int x=1;x<=9;x++) {
//			for(int y=1;y<=x;y++) {
//				System.out.print(y +"*"+ x + "=" + y*x+ "\t" );
//			}
//			System.out.println();
//		}
		
	}
	
	

}
