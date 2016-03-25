public class List<E extends Comparable<E>> {
	private Node<E> head;
	private long size;
	public List(){head = null; size = 0;}
	public Node<E> getHead(){return head;}
	public void setHead(Node<E> node){head = node;}
	public boolean isEmpty(){return head == null;}
	public long size(){return size;}
	public void addFront(E s){}
	public boolean equals(List<E> L){return false;}
	public boolean isPresent(E s){return false;}
	public List<E> intersect (List<E> L){return null;}
}
