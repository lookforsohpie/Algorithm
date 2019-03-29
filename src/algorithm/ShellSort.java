package algorithm;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] arr = new int[] {5,16,7,4,2,8,9,2,1};
		System.out.println(Arrays.toString(arr)); 
		shellSort(arr);
		System.out.println(Arrays.toString(arr)); 
		
	}

	private static void shellSort(int[] arr) {
		// TODO Auto-generated method stub
//		int step = arr.length/2,k=1;
//		while(step>0) {
//			
//			for(int i=0;i<=arr.length/2;i++) {
//				for(int j=i;j<arr.length;j+=step) {
//					if((j+step)<arr.length&&arr[j+step]<arr[j]) {
//						int temp=arr[j];
//						arr[j]=arr[j+step];
//						arr[j+step]=temp;
//					}
//				}
//			}
//			System.out.println("第"+k+"次排序的结果"+Arrays.toString(arr)); 
//			k++;
//			
//			System.out.println(step);
//			step /=2;
//		}
		int k=1;
		//遍历所有的步长
		for(int d=arr.length/2;d>0;d/=2) {
			
			//遍历所有的元素
			for(int i=d;i<arr.length;i++) {
				//遍历本组中所有元素
				for(int j=i-d;j>=0;j-=d) {
					//如果当前元素大于加上步长后的元素交换
					if(arr[j]>arr[j+d]) {
						int temp=arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
					}
				}
			}
			System.out.println(d);
			System.out.println("第"+k+"次排序的结果"+Arrays.toString(arr)); 
			k++;
		}
		
		
	}
}
