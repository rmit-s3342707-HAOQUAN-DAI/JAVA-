
public class TwoDArray {
	
	
	
	public TwoDArray() {
		int age = 16;
		int [][] arr = new int [3][2]; //3��һά���飬ÿ����������2��Ԫ��
		
		System.out.println(arr[0]); //��ӡ�Ǳ�Ϊ0������һά����
		System.out.println(arr[0][0]); //��ӡ�Ǳ�Ϊ0������һά�����нǱ�Ϊ0��Ԫ��
		
		arr[1][1] = 88; //һά�����еڶ���ĵڶ���Ԫ�ظ�ֵ88;
		arr[2][1] = age;

	}
	
	public static void print(){

		int [][] array = new int[3][];
		array[0] = new int[2]; //һά�����е�һ��Ϊ2��Ԫ�أ�ֵΪ0
		array[1] = new int[1]; //һά�����е�һ��Ϊ1��Ԫ�أ�ֵΪ0
		array[2] = new int[3]; //һά�����е�һ��Ϊ3��Ԫ�أ�ֵΪ0

		System.out.println(array[0][0]);
		
	}
	

}
