package algorithm;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] {5,16,7,4,2,8,9,2,0,1,15};
		System.out.println(Arrays.toString(arr)); 
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr)); 
	}
	
	public static void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int middle = (high+low)/2;
			mergeSort(arr, low, middle);
			mergeSort(arr, middle+1, high);
			merge(arr, low, middle, high);
		}
		
	}
	
	
	public static void merge(int[] arr,int low,int middle,int high) {
		//存储归并后的数组
		int[] temp = new int[high-low+1];
		//记录第1,2个数组下标
		int i=low,j=middle+1,index=0;
		//遍历两个数组取出来小的数字放入零时数组中
		while(i<=middle&&j<=high) {
			if(arr[i]<=arr[j]) {
				temp[index]=arr[i];
				i++;
			}else {
				temp[index]=arr[j];
				j++;
			}
			index++;
		}
		//处理多余的数据
		while(i<=middle) {
			temp[index]=arr[i];
			i++;
			index++;
		}
		
		while(j<=high) {
			temp[index]=arr[j];
			j++;
			index++;
		}
		//arr=temp
		for (int k = 0; k < temp.length; k++) {
			arr[k+low]=temp[k];
		}
	}
	
}
