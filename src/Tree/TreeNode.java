package Tree;

public class TreeNode {
	
	int value;
	TreeNode lNode;
	TreeNode rNode;
	
	public TreeNode(int value){
		this.value=value;
	}
	
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getlNode() {
		return lNode;
	}

	public void setlNode(TreeNode lNode) {
		this.lNode = lNode;
	}

	public TreeNode getrNode() {
		return rNode;
	}

	public void setrNode(TreeNode rNode) {
		this.rNode = rNode;
	}



	public void midShow() {
		// TODO Auto-generated method stub
		if(lNode!=null){
			lNode.midShow();
		}
		System.out.println(this.value);
		if(rNode!=null){
			rNode.midShow();
		}
	}



	public void afterShow() {
		// TODO Auto-generated method stub
		
		if(lNode!=null){
			lNode.afterShow();
		}
		if(rNode!=null){
			rNode.afterShow();
		}
		System.out.println(this.value);
	}
	
	
	
}
