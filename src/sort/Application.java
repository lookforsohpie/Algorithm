package sort;

public class Application {

	public static void main(String[] args) {
		int length = 30;
		int max=50;
		int[] array =new int[length];
		array = initArray(array, length,max);
		printArry(array);
		//HeapSort.heapSort(array);
		//QuickSort.quickSort(array, 0, array.length-1);
		//array=CountingSort.countingSort(array, max);
		//GreedySort.greedySort(array, length);
		//GreedySort.advanceGreedySort(array, length);
		printArry(array);
	}
	
	
	
	public static int[] initArray(int[] array,int length,int max) {
		
		array = new int[length];
		for(int i=0;i<length;i++) {
			array[i]= (int) (Math.random()*max);
		}
		return array;
	}
	
	public static void printArry(int[] array) {
		System.out.println("print Array");
		for(int i=0;i<array.length;i++) {
			System.out.println("array 第"+i+"元素="+array[i]);
		}
	}
}
