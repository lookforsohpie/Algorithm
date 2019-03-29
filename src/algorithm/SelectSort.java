package algorithm;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {5,16,7,4,2,8,9,2,0,1,15};
		System.out.println(Arrays.toString(arr)); 
		selectSort(arr);
		System.out.println(Arrays.toString(arr)); 
	}

	private static void selectSort(int[] arr) {
		// TODO Auto-generated method stub
		//遍历所有的数
		for (int i = 0; i < arr.length; i++) {
			int minIndex=i;
			//当前的数和后面的数比较
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			if(i!=minIndex) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
			
		}
	}

}
