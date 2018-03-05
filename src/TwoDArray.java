
public class TwoDArray {
	
	
	
	public TwoDArray() {
		int age = 16;
		int [][] arr = new int [3][2]; //3个一维数组，每个数组中有2个元素
		
		System.out.println(arr[0]); //打印角标为0的那组一维数组
		System.out.println(arr[0][0]); //打印角标为0的那组一维数组中角标为0的元素
		
		arr[1][1] = 88; //一维数组中第二组的第二个元素赋值88;
		arr[2][1] = age;

	}
	
	public static void print(){

		int [][] array = new int[3][];
		array[0] = new int[2]; //一维数组中第一组为2个元素，值为0
		array[1] = new int[1]; //一维数组中第一组为1个元素，值为0
		array[2] = new int[3]; //一维数组中第一组为3个元素，值为0

		System.out.println(array[0][0]);
		
	}
	

}
