package array;

public class TestSearch {
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,78,3,54,2,65,1,56,3,1};
		int target = 56;
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println("index:"+index);
		
	}
}
