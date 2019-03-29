package algorithm;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,16,7,4,2,8,9,2,0,1,15};
		System.out.println(Arrays.toString(arr)); 
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr)); 
		
	}
	
	  
	public static void quickSort(int[] arr,int start,int end) {
		
		if(start<end) {

			//把数组中第0个数字作为标准数
			int stard= arr[start];
			//记录需要排序的下标
			int low = start;
			int high = end;
			//循环找比标准数大的和小的
			while(low<high) {
				//右边的数字比标准大
				while(low<high&&stard<=arr[high]) {
					high --;
				}
				//使用右边的数字替换左边的数字
				arr[low]=arr[high];
				//左边的数字比标准数小
				while(low<high&&stard>=arr[low]) {
					low++;
				}
				arr[high]=arr[low];
			}
			//标准数赋值低的数字
			arr[low]=stard;
			
			
			
			//处理所有小的数字
			quickSort(arr, start, low);
			//处理所有大的数字
			quickSort(arr, low+1, end);
		}
		
		
	}
	
}
