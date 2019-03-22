package array;

public class MyStock {
	
	int[] elements;
	
	public MyStock() {
		elements = new int[0];
	}
	
	public void push(int element) {
		int[] newArr = new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArr[i]=elements[i];
		}
		newArr[elements.length]=element;
		elements = newArr;
	}
	
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("stock is empter");
		}
		int element =  elements[elements.length-1];
		
		int[] newArr = new int[elements.length-1];
		for (int i = 0; i < elements.length-1; i++) {
			newArr[i]=elements[i];
		}
		elements=newArr;
		return element;
	}
	public int peek() {
		if(elements.length==0) {
			throw new RuntimeException("stock is empter");
		}
		return elements[elements.length-1];
	}
	
	public boolean isEmpty() {
		return elements.length==0;
	}
	
}
