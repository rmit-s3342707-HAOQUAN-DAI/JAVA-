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

//===============数组 排序===============================
	public static void selectionSort(int[] arr) {
		
		for (int i = 0; i <arr.length-1; i++){
			
			for(int x=0;x<arr.length-1;x++){
				for(int y =x+1;y<arr.length;y++) {
					
					if(arr[x]>arr[y]) {
						int temp = arr[x];
						arr[x]=arr[y];
						arr[y]=temp;
					}
				}
			}
		}
	}
	
	
	public static void selectionSort_2(int[] arr) {
	
		for (int x=0; x<arr.length-1; x++){
			int num = arr[x];
			int index = x;
			for(int y = x+1; y<arr.length; y++){
				if (num > arr[y]){
					num = arr[y];
					index = y;
				}
				
			}
			if(index!=x){
				swap(arr,x,index);
			}
		}
		
		
		
	}
	
	
	public static void printSequence(int[] arr) {
		//sortSequence(array);
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) 
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}
	}
	
//========================冒泡排序=============================
	public static void bubbleSort(int[] arr) {
		
		for(int i =0; i<arr.length-1;i++) {
			
			for(int j =0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public static void bubbleSort_2(int[] arr) {
			
		for(int i =arr.length-1; i>=0;i--) {
				
			for(int j =0;j<i;j++) {
					
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
	}
	
	public static void bubbleSort_3(int[] arr) {
		
		for(int i =arr.length-1; i>=0;i--) {
				
			for(int j =0;j<i;j++) {
					
				if(arr[j]>arr[j+1])
				{
					swap(arr, j, j+1); //调用swap方法
				}
			}
		}			
	}
//===========================end=================================

	public static void printStr(String[] name) {
		System.out.print("[");
		for(int i=0;i<name.length;i++) {
			if(i!=name.length-1) 
				System.out.print(name[i] + ",");
			else
				System.out.println(name[i] + "]");
		}
		
	}
	
	
	public static void swap(int[] arr, int a, int b) {
		//建一个换位的方法，可以随时调用
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
//===============================Search==================================
	//find the position of an value
	public static int getIndex(int[] arr, int index) { //确定了类型为int，就必须有一个int返回值
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == index) 
			{
				return i;
			}
		}
		return -1; //角标最小是0，所以当返回值为-1时，这个值就是不存在
	}
	
	//find the value of a position
	public static int getContent(int[] arr, int index) {
		
		for(int i=0;i<arr.length;i++) {
			if(i == index) 
			{
				return arr[i];
			}
		}
		return -1;
	}
	
//二分查找  注意：必须是按顺序排列的数组才能用二分查找 binary search
	public static int binarySearch(int[] arr, int key) {
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		mid = (max + min)/2;
		
		while (arr[mid] != key) {
			if(key>arr[mid])
			{
				min = mid + 1;
			}else if(key < arr[mid])
			{
				max = mid - 1;
			}
			if(max<min)
			{			
				//System.out.print("Value not found");
				return -1;
			}
			//break;
			mid = (max+min)/2;
		}
		return mid;
		
	}
	
	
	public static int binarySearch_2(int[] arr, int key) {
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		
		while (min <= max) {
			mid = (max + min)>>1;
			if(key>arr[mid])
			{
				min = mid + 1;
			}else if(key < arr[mid])
			{
				max = mid - 1;
			}
			else
			{			
				return mid;
			}	
			
		}
		//System.out.print("Value not found");
		//return -1;	
		return min;
	}
	
//================Interview Question==================
//往一个有序的数组中加入一个数，这个数的角标如何获取
	
	public static int binarySearch_3(int[] arr, int key) {
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		
		while (min <= max) {
			mid = (max + min)>>1;
			if(key>arr[mid])
			{
				min = mid + 1;
			}else if(key < arr[mid])
			{
				max = mid - 1;
			}
			else
			{			
				return mid;
			}	
			
		}
		//返回当前这个数字应该在哪个位置
		return min;
	}
	
	
}
