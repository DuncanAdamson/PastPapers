/*
a) A critical section is a section of the code, particularly the variables within it, upon which only one thread can be allowed to operate on at any given time.
*/

/*
b)
*/

public class MyQueueTS implements Queue{
    private ArrayList<String> queue;
    public MyQueue(){
        queue = new ArrayList<String>();
    }
    public synchronized boolean add(String t){
        return queue.add(t);
    }
    public synchronized String remove() throws NoSuchElementException {
        if(queue.size() == 0){
            throw new NoSuchElementException();
        } else {
            return queue.remove(0);
        }
    }
}


/* Alternate version, without having to re-implement everything */
public class MyQueueTS implements Queue{
    private MyQueue queue;
    public MyQueue(){
        queue = new MyQueue();
    }
    public boolean add(String t){
        synchronized(this) {
            return queue.add(t);
        }
    }
    public synchronized String remove() throws NoSuchElementException {
        synchronized(this) {
            return queue.remove(t);
        }
    }
}


/*
c) See q2c.c
*/
