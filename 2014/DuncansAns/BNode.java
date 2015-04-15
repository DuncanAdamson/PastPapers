public class BNode {
	private int item;
	private BNode left;
	private BNode right;
	public BNode(int e, BNode left, BNode right){
		this.item = e;
		this.left = left;
		this.right = right;
		}
	public int getItem(){return item;}
	public BNode getLeft(){return left;}
	public BNode getRight(){return right;}
	public void setLeft(BNode nd){left = nd;}
	public void serRight(BNode nd){right = nd;}
	}
