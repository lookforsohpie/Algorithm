package array;

public class LoopNode {
	
	int data;
	
	LoopNode next=this;
	
	
	
	public LoopNode(int data) {
		this.data=data;
	}
	
	
	
//	public LoopNOde append(LoopNOde node) {
//		LoopNOde currentNode = this;
//		while(true) {
//			LoopNOde nextNode= currentNode.next();
//			if(nextNode==null) {
//				break;
//			}
//			currentNode = nextNode;
//		}
//		currentNode.next=node;
//		return this;
//	}
	
	
	
	public LoopNode next() {
		return this.next;
		
	}
	
	
	
	public int getData() {
		return this.data;
	}
	
	public boolean isLast() {
		return this.next==null;
	}
	
	public void removeNext() {
		LoopNode newNext = next.next;
		this.next=newNext;
	}
	
//	public void show() {
//		LoopNOde currentNode = this;
//		while (true) {
//			System.out.print(currentNode.data+" ");
//			if(currentNode.next==null) {
//				break;
//			}
//			currentNode = currentNode.next;
//		}
//		System.out.println("");
//	}
	
	public void after(LoopNode node) {
		LoopNode nextNext = next;
		this.next = node;
		node.next = nextNext;
	}
	
	
}
