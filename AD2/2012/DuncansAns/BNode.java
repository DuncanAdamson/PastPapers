public class BNode {
	private BNode left;
	private BNode right;
	private int item;
	public BNode(int e){
		left = null;
		right = null;
		item = e;
	}
	public int getItem(){
		return item;
	}
	public BNode getLeft(){
		return left;
	}
	public BNode getRight(){
		return right;
	}
	public void setLeft(BNode nd){
		left = nd;
	}
	public void setRight(BNode nd){
		right = nd;
	}
}
