
public class TwoDArray {
	
	//��һ�ֶ��巽��
	int [][] arr = {{3,1,7},{2,6,9,4},{4,1}}; //����һ����ά���飬������3��һά���飬ÿ��һά��������3��/4��/2�� ֵ
	//String [][] arr2 = new String [3][2];
	
	
	
	
	
	
	
	
	public TwoDArray() {
		int age = 16;
		int [][] arr = new int [3][2]; //3��һά���飬ÿ����������2��Ԫ��
		
		System.out.println(arr[0]); //��ӡ�Ǳ�Ϊ0������һά����
		System.out.println(arr[0][0]); //��ӡ�Ǳ�Ϊ0������һά�����нǱ�Ϊ0��Ԫ��
		
		arr[1][1] = 88; //һά�����еڶ���ĵڶ���Ԫ�ظ�ֵ88;
		arr[2][1] = age;

	}
	
	public static void print(){

		String [][] array = new String[3][];
		array[0] = new String[2]; //һά�����е�һ��Ϊ2��Ԫ�أ�ֵΪ0
		array[1] = new String[1]; //һά�����е�һ��Ϊ1��Ԫ�أ�ֵΪ0
		array[2] = new String[3]; //һά�����е�һ��Ϊ3��Ԫ�أ�ֵΪ0
		
		array[0][0] = "George";
		array[0][0] = "John";
//		System.out.println(array.length);//��ӡ��ά����ĳ��ȣ���ʵ����һά����ĸ���
//		System.out.println(array[1].length);//��ӡ��ά�����нǱ�Ϊ��1����һά����ĳ���
		
		
		

	}
	
	public static void printTwoDArray(int arr[][]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print(arr[i][j] + ",");
			}
		}
	}


	

}
