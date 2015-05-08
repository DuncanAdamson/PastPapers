public class BSTree {
	private BNode root;
	private int size;
	public BSTree(){
		root = null;
	}
	public int getSize(){
		return size;
	}
	public void insert(int e){}
	public boolean isPresent(int e){
		return root != null && isPresent(e,root);
	}
	public boolean isPresent(int e,BNode nd){
		return false;
	}
	public boolean subsumed(BSTree t){
		return subsumed(root,t);
	}
	public boolean subsumed(BNode bn, BSTree t){
		return false;
	}
}
