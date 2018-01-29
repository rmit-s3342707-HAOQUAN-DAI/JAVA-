/*
 * 
 * 16进制表现形式
 * 
 */

public class Hexadecimal {
	
	//基本原理
	public static void toHex(int num) {
		
		int a = num & 15;
		System.out.println("Number a = " + a);
		
		num = num >>> 4;
		int b = num & 15;
		System.out.print("Number b = " + b);
	}

	//-----------------------------------------------
	public static void toHex_2(int num) {
		for(int i=0;i<8;i++) 
		{
			int temp = num & 15;
			if(temp > 9) 
			{
				System.out.print((char)(temp - 10 + 'A'));  //强转成字母
			}else 
			{
				System.out.print(temp);			
			}
			num = num >>>4;
			
		}
		
	}
	
	//做法---数组的使用----因为两排数字对应且有序，可以作为角标使用，存储在数组中
	//根据运算结果直接去查找数组中对应的数字，即查表法
	// 0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15
	// 0，1，2，3，4，5，6，7，8，9，A, B, C, D,E, F,
	
	//=======================查找法========================
	public static void toHex_3(int num) {
		char [] chs = {'0','1','2','3',
					   '4','5','6','7',
					   '8','9','A','B',
					   'C','D','E','F'};
		
		for(int i=0;i<8;i++) 
		{
			int temp = num & 15;
			System.out.print(chs[temp]);
			num = num >>> 4;
			
		}
		System.out.println("----------------------------");
	}
	
	//==================改变数字打印方向================
	//数据比较多就先存储起来，之后再对其进行操作
	public static void toHex_4(int num) {
		char [] chs = {'0','1','2','3',
					   '4','5','6','7',
					   '8','9','A','B',
					   'C','D','E','F'};
		
		char [] array = new char [8]; //顶一个新数组作为容器，由于是16进制所以最多8位
		int position = array.length; //定义初始角标,从0开始，但此处从array的最后一个角标开始
		
		while(num !=0) {
			int temp = num & 15;
			array[--position] = chs[temp]; //--position 从最后一个指针开始依次递减，8，7，6.。。。
			num = num >>> 4;				
		}
		
		System.out.println("Position = " + position);
		for(int i=position;i<array.length;i++) 
		{
			System.out.print(array[i] +".");
			
		}
		System.out.println();
	}
	
//====================各种进制转换!!!============================
	
	//二进制
	public static void toBinary(int num){
		Transfer(num,1,1);
	}
	
	//八进制
	public static void toOctal(int num){
		Transfer(num,7,3);
	}
		
	//十六进制
	public static void toHex_5(int num){
		Transfer(num,15,4);
	}
    //核心运算
	public static void Transfer(int num, int base, int offset){
		char [] chs = {'0','1','2','3',
				       '4','5','6','7',
				       '8','9','A','B',
				       'C','D','E','F'};
		
		char [] array = new char [32];
		int position = array.length;
		
		while(num !=0) {
			int temp = num & base;
			array[--position] = chs[temp]; //--position 从最后一个指针开始依次递减，32,31,30....8，7，6.。。。
			num = num >>> offset;				
		}
		
		//System.out.println("Position = " + position);
		for(int i=position;i<array.length;i++) 
		{
			System.out.print(array[i] +".");
		}
		System.out.println();
	}
	

}
