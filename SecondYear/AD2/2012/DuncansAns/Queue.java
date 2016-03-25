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
	// NOTE, As there is no QueueException, I'm just using Excepion, just replace Exception with QueueException for your answers
	public E dequeue() throws Exception{
		Node<E> dequeued = front;
		if(front == null){
			throw new Exception("Underflow");
		}
		else{
			size --;
			front = front.getNext();
		}
		return dequeued.getElement();
	}
	public void enqueue(E s){
		size ++;
		rear.setNext(new Node<E>(s,null));
		rear = rear.getNext();
	}
}
