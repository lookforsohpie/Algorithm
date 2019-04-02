package algorithm;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{9,6,8,7,0,1,10,4,2};
		System.out.println(Arrays.toString(arr));
		
//		int start = (arr.length-1)/2;
		//调整为大顶堆
//		for(int i=start;i>=0;i--){
//			maxHeap(arr,arr.length,i);
//		}
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void maxHeap(int[] arr,int size,int index) {
		// TODO Auto-generated method stub
		if(arr==null||arr.length==0){
			return;
		}
		int leftNode = 2*index+1;
		int rightNode = 2*index+2;
		//和两个子节点分别对比
		int max=index;
		if(leftNode<size){
			max=arr[index]>arr[leftNode]?index:leftNode;
		}
		if(rightNode<size){
			max=arr[max]>arr[rightNode]?max:rightNode;
		}
		
		
		//交换位置
		if(max!=index){
			int temp = arr[index];
			arr[index] = arr[max];
			arr[max] = temp;
			//调整之前排好的
			maxHeap(arr,size,max);
		} 
	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int start = (arr.length-1)/2;
		for(int i=start;i>=0;i--){
			maxHeap(arr,arr.length,i);
		}
		for(int i=arr.length-1;i>0;i--){
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			maxHeap(arr,i,0);
		}
		
	}
	
	

}
