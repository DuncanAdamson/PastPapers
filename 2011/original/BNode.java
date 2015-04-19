public class BNode {
	private int item;
	private BNode right;
	private BNode left;
	public BNode(int e,BNode left,BNode right){
		this.item = e;
		this.left = left;
		this.right = right;
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
	public void setLeft(BNode left){
		this.left = left;
	}
	public void setRight(BNode right){
		this.right = right;
	}
}
