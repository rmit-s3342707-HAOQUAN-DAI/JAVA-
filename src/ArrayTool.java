/**
 * 
 * @author HAOQUAN DA
 * @version V1.0
 *��������Ĺ�����(��̬)��������ֵ������
 */
public class ArrayTool {
	private ArrayTool(){} //˽�л����ڱ�������޷���������  ArrayTool tool = new ArrayTool();
	
	
	/**
	 * 
	 * @param arr ����һ��Ԫ��Ϊint������
	 * @return ����������Ԫ��ֵ
	 */
	public static int getMax(int[] arr) {
		int maxIndex = 0; 
		
		for(int i = 1; i<arr.length; i++) { //i��ʼ����1����Ϊ��һ�����ֲ��ø���һ��������Ƚ�
			if(arr[i]>arr[maxIndex])
				maxIndex = i;
		}
		return arr[maxIndex];
	}

	/**
	 * 
	 * @param arr ����һ��Ԫ������Ϊint������
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
	 * �������Ԫ��λ���û�
	 * @param arr ����һ������Ϊint������
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
	 * @param arr ����һ��Ԫ��Ϊint������
	 * @param key Ҫ�ҵ�Ԫ��
	 * @return ���ظ�Ԫ�ص�һ�γ��ֵ�λ�ã���������ڣ�����-1
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
	 * ��int����ת�����ַ�������ʽΪ[e1,e2....]
	 * @param arr ����һ������Ϊint������
	 * @return ���ظ�������ַ���
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
