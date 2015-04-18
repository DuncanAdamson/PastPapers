public class Queue<E> {
	private Node<E> front;
	private Node<E> rear;
	private int size;
	public Queue(){
		front = rear = null;
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return front == null;
	}
	public E dequeue() throws Exception{
		return null;
	}
	public void enqueue(E s){
	}
}
