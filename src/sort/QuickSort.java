package sort;

public class QuickSort {
	
	/**
	 * Partition (rearrange) the array A(p,r) into two (possibly empty) subarrays A(p,q) such that each element of A(p,q) 
	 * is less than or equal to A(q+1,r) which is, in turn, less than or equal to each element
		of A(q+1,r) Compute the index q as part of this partitioning procedure.
	 * @param A array
	 * @param p index
	 * @param r index
	 */
	public static int partition(int[] A,int p,int r) {
		int i=p-1,j=p,tmp;
		for(;j<=r-1;j++) {
			if(A[j]<=A[r]) {
				i++;
				tmp=A[j];
				A[j]=A[i];
				A[i]=tmp;
			}
		}
		tmp=A[r];
		A[r]=A[i+1];
		A[i+1]=tmp;
		return i+1;
	}
	
	public static void quickSort(int[] A,int p,int r) {
		if(p<r) {
			int q =partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	
}
