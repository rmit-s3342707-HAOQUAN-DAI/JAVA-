/**
 * 
 * @author HAOQUAN DA
 * @version V1.0
 *操作数组的工具类(静态)，包括最值，排序
 */
public class ArrayTool {
	private ArrayTool(){} //私有化，在别的类里无法申明对象  ArrayTool tool = new ArrayTool();
	
	
	/**
	 * 
	 * @param arr 接收一个元素为int的数组
	 * @return 该数组的最大元素值
	 */
	public static int getMax(int[] arr) {
		int maxIndex = 0; 
		
		for(int i = 1; i<arr.length; i++) { //i初始等于1，因为第一个数字不用跟第一个数字相比较
			if(arr[i]>arr[maxIndex])
				maxIndex = i;
		}
		return arr[maxIndex];
	}

	/**
	 * 
	 * @param arr 接收一个元素类型为int的数组
	 */
	public static void selectSort(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
	}
	
	
	/**
	 * 给数组的元素位置置换
	 * @param arr 接收一个类型为int的数组
	 * @param a
	 * @param b
	 */
	private static void swap(int[] arr,int a,int b) 
	{
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	/**
	 * 
	 * @param arr 接收一个元素为int的数组
	 * @param key 要找的元素
	 * @return 返回该元素第一次出现的位置，如果不存在，返回-1
	 */
	public static int getIndex(int [] arr, int key) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	/**
	 * 将int数组转换成字符串，格式为[e1,e2....]
	 * @param arr 接收一个类型为int的数组
	 * @return 返回该数组的字符串
	 */
	public static String arrayToString(int [] arr) 
	{
		String str = "[";
		
		for(int i=0;i<arr.length;i++) 
		{
			if(i!=arr.length-1) {
				str = str + "," + arr[i];
			}
				else {
				str = str + "," + arr[i];
			}
		}
		return str;
	}
	
}
