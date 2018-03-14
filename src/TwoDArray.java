
public class TwoDArray {
	
	//另一种定义方法
	int [][] arr = {{3,1,7},{2,6,9,4},{4,1}}; //定义一个二维数组，里面有3个一维数组，每个一维数组中有3个/4个/2个 值
	//String [][] arr2 = new String [3][2];
	
	
	
	
	
	
	
	
	public TwoDArray() {
		int age = 16;
		int [][] arr = new int [3][2]; //3个一维数组，每个数组中有2个元素
		
		System.out.println(arr[0]); //打印角标为0的那组一维数组
		System.out.println(arr[0][0]); //打印角标为0的那组一维数组中角标为0的元素
		
		arr[1][1] = 88; //一维数组中第二组的第二个元素赋值88;
		arr[2][1] = age;

	}
	
	public static void print(){

		String [][] array = new String[3][];
		array[0] = new String[2]; //一维数组中第一组为2个元素，值为0
		array[1] = new String[1]; //一维数组中第一组为1个元素，值为0
		array[2] = new String[3]; //一维数组中第一组为3个元素，值为0
		
		array[0][0] = "George";
		array[0][0] = "John";
//		System.out.println(array.length);//打印二维数组的长度，其实就是一维数组的个数
//		System.out.println(array[1].length);//打印二维数组中角标为“1”的一维数组的长度
		
		
		

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
