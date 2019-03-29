package algorithm;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {5,16,7,4,2,8,9,2,0,1,15};
		System.out.println(Arrays.toString(arr)); 
		insertSort(arr);
		System.out.println(Arrays.toString(arr)); 

	}
	
	public static void insertSort(int[] arr) {
		//遍历所有的数字
		for (int i = 1; i < arr.length; i++) {
			//如果当前数字比前一个数字小
			if(arr[i]<arr[i-1]) {
				//把当前遍历数字存起来
				int temp = arr[i];
//				int j;
//				for ( j = i-1; j>=0&&arr[j]>temp; j--) {
//					//把前一个数字付给后一个数字
//					arr[j+1]=arr[j];
//				}
//				arr[j+1]=temp;
				
				int j=i-1;
				while(j>=0&&temp<arr[j]) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=temp;
			}
			
		}
		
		
		
	}
	

}
