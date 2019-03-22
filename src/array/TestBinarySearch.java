package array;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,5,7,9,12,14,16,17,20,24,46};
		int target = 13;
		
		int begin = 0;
		int end = arr.length-1;
		int mid =(begin+end)/2;
		int index=-1;
		while(true) {
			if(arr[mid]==target) {
				index=mid;
				break;
			}else {
				if(arr[mid]>target){
					end=mid-1;
				}else {
					begin=mid+1;
				}
				if(end<begin) {
					break;
				}
				mid=(begin+end)/2;
			} 
		}
		System.out.println(index);
		
	}
}
