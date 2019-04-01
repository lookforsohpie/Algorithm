package algorithm;

import java.util.Arrays;

public class RadixSort {
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,169,7,24,2,358,9,42,0,121,615,894};
		System.out.println(Arrays.toString(arr)); 
		radixSort(arr);
		System.out.println(Arrays.toString(arr)); 
	}

	private static void radixSort(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		//计算最大数字是几位数
		int maxLength =(max+"").length();
		//用于临
		int[][] temp = new int[10][arr.length];
		//在相应数组中存放的数据的数量
		int[] counts = new int[10];
		
		//根据最大长度的数比较的次数
		for (int i = 0,n=1; i < maxLength; i++,n*=10) {
			//余数 ys
			for(int j=0;j<arr.length;j++){
				int ys = arr[j]/n%10;
				temp[ys][counts[ys]] =arr[j];
				counts[ys]++;
			}
			
			//记录取得元素需要放入的位置
			int index=0;
			//把数字取出来
			for(int k=0;k<counts.length;k++){
				if(counts[k]!=0){
					for(int l=0;l<counts[k];l++){
						arr[index] = temp[k][l];
						index++;
					}
				}
				counts[k]=0;
			}
		
				for(int[] nums:temp){
					System.out.println(Arrays.toString(nums));
					
				}
				System.out.println("=====================================");
		}
		
		
		
	}
	
	
}
