package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * @author xtgs
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {5,16,7,4,2,8,9,2,0,1,15};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	public static void bubbleSort(int[] arr) {
		//控制工比较多少轮
		for (int i = 0; i < arr.length-1; i++) {
			//控制比较的次数
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
		}
		
		
	}

}
