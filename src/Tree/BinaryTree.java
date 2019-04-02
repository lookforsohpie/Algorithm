package Tree;

public class BinaryTree {
	
	TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void frontShow() {
		// TODO Auto-generated method stub
		//front(root);
		if(root!=null) {
			root.frontShow();
		}
		
	}
	
	private void front(TreeNode node){
		if(node!=null){
			System.out.println(node.getValue());
			if(node.lNode!=null){
				front(node.lNode);
			}
			if(node.rNode!=null){
				front(node.rNode);
			}
		}
		
	}

	public void midShow() {
		// TODO Auto-generated method stub
		root.midShow();
	}

	public void afterShow() {
		// TODO Auto-generated method stub
		root.afterShow();
	}

	public TreeNode frontSearch(int i) {
		// TODO Auto-generated method stub
		return root.frontSearch(i);
	}

	public void delete(int i) {
		// TODO Auto-generated method stub
		if(root.value==i) {
			root=null;
			return;
		}
		root.delete(i);
	}
	
	
	
}
