import java.util.*;

public class ArrayDemo {
	
	static int [] array = {12,23,34,49,59,64,71,89,92,0,4,23,7,52};
	static int [] negativeArray = new int [] {-12,-23,-34,-47,-59,-64,-71,-89,-92,-10,-45,-23,-74,-52};
	static String [] names = {"Jack","Bob","George","Lina","Demi","Molly","Allen","Tim","Shirley","Tony"};
	static String [] week = new String []{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) 
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}
		
	}
	
	public static String getWeek(){
		int num = Utility.GetRandom(0, 6);
		return week[num];
	}
	
	public static void print(int i) {
		
		System.out.println(names[i]);
	}
	
	public static void printLength() {
		System.out.println(names.length);
	}

//===============Array 求最大 =============================
	public static int getMax(int[] arr) {
		int maxElement = arr[0]; //这里不用0 因为是数组自己的数据跟自己比，不用跟0比
		
		for(int i = 1; i<arr.length; i++) { //i初始等于1，因为第一个数字不用跟第一个数字相比较
			if(arr[i]>maxElement)
				maxElement = arr[i];
		}
		return maxElement;
	}
	
	public static int getMax_2(int[] arr) {
		int maxIndex = 0; 
		
		for(int i = 1; i<arr.length; i++) { //i初始等于1，因为第一个数字不用跟第一个数字相比较
			if(arr[i]>arr[maxIndex])
				maxIndex = i;
		}
		return arr[maxIndex];
	}
	
	public static void printMax() {
		int arrayMax = getMax(negativeArray);
		System.out.println(arrayMax);
	}
//================end===================================


	
	
}
