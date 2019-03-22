package array;

public class MyQueue {
	
	int[] elements;
	
	public  MyQueue() {
		// TODO Auto-generated constructor stub
		elements = new int[0];
	}
	
	public void add(int element) {
		int[] newArr = new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArr[i]=elements[i];
		}
		newArr[elements.length]=element;
		elements = newArr;
	}
	
	public int poll() {
		int element = elements[0];
		
		int[] newArr = new int[elements.length-1];
		for (int i = 0; i < elements.length-1; i++) {
			newArr[i]=elements[i+1];
		}
		elements=newArr;
		return element;
	}
	public boolean isEmpty() {
		return elements.length==0;
	}
}
