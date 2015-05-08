public class BSTree {
	private BNode root;
	public BSTree(){
		root = null;
	}
	public BNode root(){
		return root;
	}
	public boolean isEmpty(){
		return root == null;
	}
	public void insert(int e){
		if (isEmpty()){
			root = new BNode(e,null,null);
		}
		else {
			insert(e,root);
		}
	}
	public void insert(int e, BNode nd){
		if(e > nd.getItem()){
			if(nd.getRight() == null){
				nd.setRight(new BNode(e,null,null));
			}
			else{
				insert(e,nd.getRight());
			}
		}
		else if(e < nd.getItem()){
			if(nd.getLeft() == null){
				nd.setLeft(new BNode(e,null,null));
			}
			else{
				insert(e,nd.getLeft());
			}
		}
	}
	public boolean isPresent(int e){
		return root != null && isPresent(e,root);
	}
	private static boolean isPresent(int e,BNode nd){
		if(nd == null){
			return false;
		}
		if(nd.getItem() == e){
			return true;
		}
		else if(e > nd.getItem()){
			return isPresent(e,nd.getRight());
		}
		else{
			return isPresent(e,nd.getLeft());
		}
	} 
}
