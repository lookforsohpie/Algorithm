package Tree;

public class ArrayBinaryTree {
	int[] data;
	
	public ArrayBinaryTree(int[] data){
		this.data=data;
	}
	
	
	public void frongtShoe(int index){
		if(data==null||data.length==0){
			return;
		}
		if(index<data.length){
			System.out.println(data[index]);
			if((2*index+1)<data.length){
				frongtShoe(2*index+1);
			}
			if((2*index+2)<data.length){
				frongtShoe(2*index+2);
			}
		}
	}
	
}
