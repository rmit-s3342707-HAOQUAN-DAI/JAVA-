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

//===============Array ����� =============================
	public static int getMax(int[] arr) {
		int maxElement = arr[0]; //���ﲻ��0 ��Ϊ�������Լ������ݸ��Լ��ȣ����ø�0��
		
		for(int i = 1; i<arr.length; i++) { //i��ʼ����1����Ϊ��һ�����ֲ��ø���һ��������Ƚ�
			if(arr[i]>maxElement)
				maxElement = arr[i];
		}
		return maxElement;
	}
	
	public static int getMax_2(int[] arr) {
		int maxIndex = 0; 
		
		for(int i = 1; i<arr.length; i++) { //i��ʼ����1����Ϊ��һ�����ֲ��ø���һ��������Ƚ�
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

//===============���� ����===============================
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
	
//========================ð������=============================
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
					swap(arr, j, j+1); //����swap����
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
		//��һ����λ�ķ�����������ʱ����
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
//===============================Search==================================
	//find the position of an value
	public static int getIndex(int[] arr, int index) { //ȷ��������Ϊint���ͱ�����һ��int����ֵ
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == index) 
			{
				return i;
			}
		}
		return -1; //�Ǳ���С��0�����Ե�����ֵΪ-1ʱ�����ֵ���ǲ�����
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
	
//���ֲ���  ע�⣺�����ǰ�˳�����е���������ö��ֲ��� binary search
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
//��һ������������м���һ������������ĽǱ���λ�ȡ
	
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
		//���ص�ǰ�������Ӧ�����ĸ�λ��
		return min;
	}
	
	
}
