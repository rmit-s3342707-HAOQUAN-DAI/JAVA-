import java.util.Scanner;
import java.util.*;

public class Test {
	static int i;
	static Scanner s = new Scanner(System.in);
	static int[] A = new int[] {1,23,4,6,63,23,34,6,2,76,32,3,42,35,2,95};
	static int [] array = {12,23,34,49,59,64,71,89,92,0,4,23,7,52};
	static int [] negArray = new int [] {-12,-23,-34,-47,-59,-64,-71,-89,-92,-10,-45,-23,-74,-52};
	static String [] names = {"Jack","Bob","George","Lina","Demi","Molly","Allen","Tim","Shirley","Tony"};
	
	public static void main(String[] args) {
		System.out.println("Total number of people is:" );
		
		ArrayDemo.printLength();
		
		//System.out.println("Please enter the number:");

		//i = s.nextInt();	
		//System.out.print("Number " + i + " is：");
		//ArrayDemo.print(i);
		
		//System.out.println("The largest number in array is:");
		//ArrayDemo.printMax();
			
		ArrayDemo.printSequence(array);
		ArrayDemo.selectionSort(array);
		ArrayDemo.printSequence(array);
		
		printArray(A);
		sortRank(A);
		printArray(A);
		
		ArrayDemo.bubbleSort_2(array);
		ArrayDemo.printSequence(array);
		
		Arrays.sort(negArray); // java 自带的排序工具
		ArrayDemo.printSequence(negArray);
		Arrays.sort(names);
		ArrayDemo.printStr(names);
		
		
	}
	
	public static void sortRank(int[] sortList){
		for(int x=0;x<sortList.length-1;x++){
			for(int y =x+1;y<sortList.length;y++) {
				if(sortList[x]>sortList[y]) {
					int temp = sortList[x];
					sortList[x]=sortList[y];
					sortList[y]=temp;
				}
			}
		}
		
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) 
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}
	}

}
