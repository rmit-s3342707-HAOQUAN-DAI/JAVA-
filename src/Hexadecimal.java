/*
 * 
 * 16���Ʊ�����ʽ
 * 
 */

public class Hexadecimal {
	
	//����ԭ��
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
				System.out.print((char)(temp - 10 + 'A'));  //ǿת����ĸ
			}else 
			{
				System.out.print(temp);			
			}
			num = num >>>4;
			
		}
		
	}
	
	//����---�����ʹ��----��Ϊ�������ֶ�Ӧ�����򣬿�����Ϊ�Ǳ�ʹ�ã��洢��������
	//����������ֱ��ȥ���������ж�Ӧ�����֣������
	// 0��1��2��3��4��5��6��7��8��9��10��11��12��13��14��15
	// 0��1��2��3��4��5��6��7��8��9��A, B, C, D,E, F,
	
	//=======================���ҷ�========================
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
	
	//==================�ı����ִ�ӡ����================
	//���ݱȽ϶���ȴ洢������֮���ٶ�����в���
	public static void toHex_4(int num) {
		char [] chs = {'0','1','2','3',
					   '4','5','6','7',
					   '8','9','A','B',
					   'C','D','E','F'};
		
		char [] array = new char [8]; //��һ����������Ϊ������������16�����������8λ
		int position = array.length; //�����ʼ�Ǳ�,��0��ʼ
		
		while(num !=0) {
			int temp = num & 15;
			array[--position] = chs[temp];
			num = num >>> 4;				
		}
		
		System.out.println("Position = " + position);
		for(int i=position;i<array.length;i++) 
		{
			System.out.print(array[i] +".");
		}
		
	}
	

}
