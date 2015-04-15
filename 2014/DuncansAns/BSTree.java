public class BSTree {
	private BNode root;
	public BSTree(){root = null;}
	public BNode root(){return root;}
	public boolean isEmpty(){return root == null;}
	public void insert(int e){
		if (isEmpty()) {root = new BNode(e,null,null);}
		else insert(e,root);
	}
	private static void insert(int e,BNode nd){
		if (e > nd.getItem()){
			if (nd.getRight() != null) {nd.setRight(new BNode(e,null,null));}
			else {insert(e,nd.getRight());}
		}
		else if (e < nd.getItem()){
			if (nd.getLeft() != null) {nd.setLeft(new BNode(e,null,null));}
			else {insert(e,nd.getLeft());}
		}
		// Ignores nd.getItem == e as specified
	}
	public boolean isPresent(int e){return root != null && isPresent(e,root);}
	private static boolean isPresent(int e,BNode nd){return false;}
}
