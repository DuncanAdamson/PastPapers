public class BSTree {
	private BNode root;
	public BSTree(){root = null;}
	public BNode root(){return root;}
	public boolean isEmpty(){return root == null;}
	public void insert(int e){
		if (isEmpty()) {root = new BNode(e,null,null);}
		else insert(e,root);
	}
	private static void insert(int e,BNode nd){}
	public boolean isPresent(int e){return root != null && isPresent(e,root);}
	private static boolean isPresent(int e,BNode nd){return false;}
}
