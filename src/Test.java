import java.util.Scanner;

import polymorphism.Demo;

import java.util.*;
/**
 * 
 * @author HAOQUAN DAI
 *
 */
public class Test {
	static int i;
	static Scanner s = new Scanner(System.in);
	static int[] A = new int[] {1,23,4,6,63,23,34,6,2,76,32,3,42,35,2,95};
	static int[] B = new int[] {0,10,20,30,40,50,60,70,80,90,100};
	static int [] array = {12,23,34,49,59,64,71,89,92,0,4,23,7,52};
	static int [] negArray = new int [] {-12,-23,-34,-47,-59,-64,-71,-89,-92,-10,-45,-23,-74,-52};
	static String [] names = {"Jack","Bob","George","Lina","Demi","Molly","Allen","Tim","Shirley","Tony"};
	static int [][] arr = {{3,1,7},{2,6,9,4},{4,1}};
	
	
	public static void main(String[] args) throws Exception {
		System.out.println("Total number of people is:" );
		
		ArrayDemo.printLength();
		
		
		//System.out.println("Please enter the number:");

		//i = s.nextInt();	
		//System.out.print("Number " + i + " is��");
		//ArrayDemo.print(i);
		
		//System.out.println("The largest number in array is:");
		//ArrayDemo.printMax();
			
//		ArrayDemo.printSequence(array);
//		ArrayDemo.selectionSort(array);
//		ArrayDemo.printSequence(array);
//		
//		
//		ArrayDemo.bubbleSort_2(array);
//		ArrayDemo.printSequence(array);
//		
//		Arrays.sort(negArray);			 // java �Դ������򹤾�
//		ArrayDemo.printSequence(negArray);
//		
//		Arrays.sort(names);
//		ArrayDemo.printStr(names);
//		
		int a = Sort.getIndex(array, 4);
		int b = Sort.getContent(array, 8);	
		System.out.println("Index 4 is in position: " + a);
		System.out.println("Position 8 is:" + b);
		
		int c = Sort.binarySearch_2(B, 55);
		System.out.println("the position is: " + c);
		int d = Arrays.binarySearch(B, 90); 		//java �Դ����ߣ������ܲ���������û�е�����λ�ã����򷵻�ֵΪ������λ�õ���-1
		System.out.println("the position should be: " + d);
		
		//16����
//		Hexadecimal.toHex_3(60);
//		Hexadecimal.toHex_4(60);
		System.out.println(ArrayDemo.getWeek());
		System.out.println(Utility.getRandomName());
		Hexadecimal.toBinary(2);
		
//		System.out.print(Integer.toBinaryString(20)); //JAVA �Դ���ת���ƺ���
//		System.out.print(Integer.toHexString(20)); //JAVA �Դ���ת���ƺ���
		
//		TwoDArray.print();
		
		System.out.println(ArrayDemo.getMax(array));
		ArrayDemo.printMax();

		
		//ArrayDemo.selectionSort_2(array);
		//ArrayDemo.printSequence(array);
		
		System.out.print(Utility.getRank(75));
		
		ArrayDemo.printArray(negArray);
		Sort.selectionSort2(array);
		Sort.printSequence(array);
		
		//System.out.println(OverLoad.add(3.4,10.3)); //overload practice
		OverLoad c1 = new OverLoad(); //�����µ�Overload���󣬵������еķ������Ͳ���Ҫstatic���Σ�������һ�ַ�������Ҫstatic����
		System.out.println(c1.add(2.6,4.2));
		c1.printTable(8);//���㷽�����Ѿ����˱���9�����ǻᱻ����
		//TwoDArray.printTwoDArray(arr);

		//ArrayTool tool = new ArrayTool();//�Ծ�̬����û�����壬ֻ���˷��ڴ�ռ䣬ֱ��ArrayList.����()�Ϳ���
		//int max = tool.getMax(A);
		System.out.println(ArrayTool.getMax(A));
		System.out.println(ArrayTool.getIndex(A, 4));
		//RockPaperScissorGame.iniGame();
		
		

	}
	
		
	
}
