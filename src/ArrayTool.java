
public class ArrayTool {

	public int getMax(int[] arr) {
		int maxIndex = 0; 
		
		for(int i = 1; i<arr.length; i++) { //i初始等于1，因为第一个数字不用跟第一个数字相比较
			if(arr[i]>arr[maxIndex])
				maxIndex = i;
		}
		return arr[maxIndex];
	}

	public void selectSort(int[] arr) 
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
	
	private void swap(int[] arr,int a,int b) 
	{
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public int getIndex(int [] arr, int key) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	public String arrayToString(int [] arr) 
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
