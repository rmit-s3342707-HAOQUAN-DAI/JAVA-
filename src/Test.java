import java.util.Scanner;
import java.util.*;

public class Test {
	static int i;
	static Scanner s = new Scanner(System.in);
	static int[] A = new int[] {1,23,4,6,63,23,34,6,2,76,32,3,42,35,2,95};
	static int[] B = new int[] {0,10,20,30,40,50,60,70,80,90,100};
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
			
//		ArrayDemo.printSequence(array);
//		ArrayDemo.selectionSort(array);
//		ArrayDemo.printSequence(array);
//		
//		printArray(A);
//		sortRank(A);
//		printArray(A);
//		
//		ArrayDemo.bubbleSort_2(array);
//		ArrayDemo.printSequence(array);
//		
//		Arrays.sort(negArray); // java 自带的排序工具
//		ArrayDemo.printSequence(negArray);
//		
//		Arrays.sort(names);
//		ArrayDemo.printStr(names);
//		
//		int a = ArrayDemo.getIndex(array, 4);
//		int b = ArrayDemo.getContent(array, 8);	
//		System.out.println("Index 4 is in position: " + a);
//		System.out.println("Position 8 is:" + b);
//		
//		int c = ArrayDemo.binarySearch_2(B, 55);
//		System.out.println("the position is: " + c);
//		int d = Arrays.binarySearch(B, 90); //java 自带工具，但不能查找数组中没有的数字位置，否则返回值为负数的位置点再-1
//		System.out.println("the position should be: " + d);
		
		//16进制
//		Hexadecimal.toHex_3(60);
//		Hexadecimal.toHex_4(60);
		System.out.println(ArrayDemo.getWeek());
		System.out.println(Utility.getRandomName());
		Hexadecimal.toBinary(2);
		
//		System.out.print(Integer.toBinaryString(20)); //JAVA 自带的转进制函数
//		System.out.print(Integer.toHexString(20)); //JAVA 自带的转进制函数
		
//		TwoDArray.print();
		
		System.out.println(ArrayDemo.getMax(array));
		ArrayDemo.printMax();
		ArrayDemo.printArray(negArray);
		ArrayDemo.selectionSort_2(array);
		ArrayDemo.printSequence(array);
		
	}
	

}
