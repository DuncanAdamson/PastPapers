/*
a) A critical section is a section of the code, particularly the variables within it, upon which only one thread can be allowed to opperate on at any given time.
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

/*
c) See q2c.c
*/

