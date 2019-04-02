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
		
		binTree.frontShow();
//		binTree.midShow();
//		binTree.afterShow();
		
//		TreeNode result = binTree.frontSearch(7);
//		
//		System.out.println(result);
		//System.out.println(result==rootR);
		binTree.delete(1);
		System.out.println("=============================");
		binTree.frontShow();
		
	}
}
