package Tree;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree binTree = new BinaryTree();
		TreeNode root = new TreeNode(1);
		binTree.setRoot(root);
		TreeNode rootR = new TreeNode(3);
		root.setrNode(rootR);
		TreeNode rootL = new TreeNode(2);
		root.setlNode(rootL);
		
		
		rootL.setlNode(new TreeNode(4));
		rootL.setrNode(new TreeNode(5));
		rootR.setlNode(new TreeNode(6));
		rootR.setrNode(new TreeNode(7));
		
		//binTree.frontShow();
		//binTree.midShow();
		binTree.afterShow();
		
		
		
	}
}
