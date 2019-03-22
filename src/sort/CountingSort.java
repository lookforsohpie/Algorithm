package sort;

/**
 * 
 * @author xtgs
 *
 */
public class CountingSort {
	
	public static int[] countingSort(int[] A,int max) {
		int[] result = new int[A.length];
		int[] temp = new int[max+1];
		for(int i=0;i<=max;i++) {
			temp[i]=0;
		}
		for(int i=0;i<A.length;i++) {
			temp[A[i]]+=1;
		}
		for(int i=1;i<=max;i++) {
			temp[i]=temp[i-1]+temp[i];
		}
		for(int i=0;i<A.length;i++) {
			result[temp[A[i]]-1]=A[i];
			temp[A[i]]--;
		}
		
		return result;
	}
	
	
}
