public class Node<E> {
	private E element;
	private Node<E> next;
	public Node(){
		this(null,null);
	}
	public Node(E element,Node<E> next){
		this.element = element;
		this.next = next;
	}
	public E getElement(){
		return element;
	}
	public void setElement(E element){
		this.element = element;
	}
	public Node<E> getNext(){
		return next;
	}
	public void setNext(Node<E> next){
		this.next = next;
	}
}
