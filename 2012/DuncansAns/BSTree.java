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
		if(nd == null){
			return false;
		}
		if(e == nd.getItem()){
			return true;
		}
		else if(e > nd.getItem()){
			return isPresent(e,nd.getRight());
		}
		else{
			return isPresent(e,nd.getLeft());
		}
	}
	public boolean subsumed(BSTree t){
		return subsumed(root,t);
	}
	public boolean subsumed(BNode bn, BSTree t){
		if(bn == null){
			return true;
		}
		return t.isPresent(bn.getItem()) && subsumed(bn.getLeft(),t) && subsumed(bn.getRight(),t);
		
	}
}
