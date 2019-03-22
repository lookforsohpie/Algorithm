package sort;

public class HeapSort {
	
	public static void heapSort(int[] array) {
		buildMaxHeapSort(array,array.length-1);
		int tmp,j=1; 
		for(int i=array.length-1;i>0;i--) {
			tmp=array[i];
			array[i]=array[0];
			array[0]=tmp;
			maxHeaply(array,0,array.length-1-j);
			j++;
		}
	}
	/**
	 * 保持maxHeap的特性
	 * @param array 改变的数组
	 * @param i 节点node
	 * @param j 数组的长度;数组的最后节点
	 */
	private static void maxHeaply(int[] array, int i, int length) {
		// TODO Auto-generated method stub
		Integer l,r,largest,tmp;
			l=2*i;
			r=2*i+1;
		if(2*i<=length&&array[l]>array[i]) {
			largest=l;
		}else {
			largest=i;
		}
		if((2*i+1)<=length&&array[r]>array[largest]) {
			largest=r;
		}
		if(largest!=i) {
			tmp=array[i];
			array[i]=array[largest];
			array[largest]=tmp;
			maxHeaply(array, largest, length);
		}
	}

	/**
	 * 改变array为MaxHeap
	 * @param array 传递的数组
	 * @param length 创建maxheap的长度；数组的最大index
	 */
	private static void buildMaxHeapSort(int[] array, int length) {
		// TODO Auto-generated method stub
		for(int i=length/2;i>=0;i--) {
			maxHeaply(array, i, length);
		}
	}
}
