
public class ArrayDemo {
	
	static int [] array = {12,23,34,49,59,64,71,89,92,0,4,23,7,52};
	static int [] negativeArray = new int [] {-12,-23,-34,-47,-59,-64,-71,-89,-92,-10,-45,-23,-74,-52};
	static String [] names = {"Jack","Bob","George","Lina","Demi","Molly","Allen","Tim","Shirley","Tony"};
	

	public static void print(int i) {
		
		System.out.println(names[i]);
	}
	
	public static void printLength() {
		System.out.println(names.length);
	}

//===============Array 求最大 =============================
	public static int getMax(int[] arr) {
		int maxIndex = arr[0]; //这里不用0 因为是数组自己的数据跟自己比，不用跟0比
		
		for(int i = 1; i<arr.length; i++) { //i初始等于1，因为第一个数字不用跟第一个数字相比较
			if(arr[i]>maxIndex)
				maxIndex = i;
		}
		return arr[maxIndex];
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
	
	
}
