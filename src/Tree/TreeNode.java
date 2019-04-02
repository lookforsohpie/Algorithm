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



	public void frontShow() {
		// TODO Auto-generated method stub
		System.out.println(this.value);
		if(lNode!=null){
			lNode.frontShow();
		}
		if(rNode!=null){
			rNode.frontShow();
		}
	}



	public TreeNode frontSearch(int i) {
		// TODO Auto-generated method stub
		if(this.value==i) {
			return this;
		}
		if(lNode!=null) {
			if(lNode.frontSearch(i)!=null) {
				return lNode.frontSearch(i);
			}
		}
		if(rNode!=null) {
			if(rNode.frontSearch(i)!=null) {
				return rNode.frontSearch(i);
			}
		}
		return null;
	}



	public void delete(int i) {
		// TODO Auto-generated method stub
		
		TreeNode parent=this;
		if(lNode!=null) {
			if(lNode.getValue()==i) {
				parent.lNode=null;
				return;
			}else {
				lNode.delete(i);
			}
		}
		if(rNode!=null) {
			if(rNode.getValue()==i) {
				parent.rNode=null;
				return;
			}else {
				rNode.delete(i);
			}
		}
		
	}
	
	
	
}
