package array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyArray arr1 = new MyArray();
//		arr1.add(1);
//		arr1.add(3);
//		arr1.add(99);
//		arr1.add(2);
//		arr1.show();
//		arr1.delete(0);
//		arr1.get(2);
//		arr1.show();
//		System.out.println(arr1.get(2));
//		
//		System.out.println("==========================");
//		arr1.insert(2, 10);
//		arr1.show();
//		arr1.set(1, 10);
//		arr1.show();
//		arr1.add(1);
//		arr1.add(2);
//		arr1.add(3);
//		arr1.show();
//		arr1.search(4);
//		System.out.println(arr1.search(1));
//		System.out.println(arr1.binarySearch(1));
		
//		MyStock ms = new MyStock();
//		
//		ms.push(2);
//		ms.push(7);
//		ms.push(9);
////		System.out.println(ms.pop());
////		System.out.println(ms.pop());
////		System.out.println(ms.pop());
//		System.out.println(ms.peek());
//		System.out.println(ms.pop());
//		System.out.println(ms.peek());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.isEmpty());
		
//		MyQueue mq = new MyQueue();
//		mq.add(14);
//		mq.add(9);
//		mq.add(7);
//		System.out.println(mq.poll());
//		System.out.println(mq.poll());
//		System.out.println(mq.isEmpty());
//		System.out.println(mq.poll());
//		System.out.println(mq.isEmpty());
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
////		n1.append(n2).append(n3);
////		System.out.println(n1.next.getData());
////		System.out.println(n1.next.next().isLast());
//		n1.append(n2).append(n3).append(n4);
////		n1.show();
////		n1.next().removeNext();
//		n1.show();
//		Node n5 = new Node(5);
//		n1.next().after(n5);
//		n1.show();
		
//		LoopNode n1 = new LoopNode(1);
//		LoopNode n2 = new LoopNode(2);
//		LoopNode n3 = new LoopNode(3);
//		LoopNode n4 = new LoopNode(4);
//		LoopNode n5 = new LoopNode(5);
//		
//		n1.after(n2);
//		n2.after(n3);
//		n3.after(n4);
//		System.out.println(n1.next.getData());
//		System.out.println(n2.next.getData());
//		System.out.println(n3.next.getData());
//		System.out.println(n4.next.getData());
		
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);
		n1.after(n2);
		n2.after(n3);
		
		System.out.println(n2.next.getData());	
		System.out.println(n2.getData());	
		System.out.println(n2.pre.getData());	
		System.out.println(n3.next.getData());
		System.out.println(n1.pre.getData());
		
	}

}
