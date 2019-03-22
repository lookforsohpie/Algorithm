package sort;

import java.util.Arrays;

public class GreedySort {

	
		public static void greedySort(int[] A,int n) {
			
			for(int i=1;i<n;) {
				if(i<1||A[i]>=A[i-1]) {
					i++;
				}else {
					swapA2B(A, i, i-1);
					i--;
				}
			}
		}
		

		public static void advanceGreedySort(int[] A,int n) {
			for(int k=1;k<n;k++) {
				for(int i=k;i>=1&&A[i]<A[i-1];i--) {
					swapA2B(A, i, i-1);
				}
			}
		}
		
		
		public static void swapA2B(int[] A ,int a,int b) {
			int tmp;
			tmp=A[a];
			A[a]=A[b];
			A[b]=tmp;
		}
}
