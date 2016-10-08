/*
3a)
The first mechanism is to create a class which extends the thread class, and overwrite the run() method with the new method to be the new one to be run.
The second method is to create a class that implements the runnable interface, with the run method being the function to be run as the thread. This class is then wrapped in a thread to allow running.
The second method is the preferred method for use in Java. This is because it more general due to it allowing the subclassing of another class.
b)
All Java objects have an intrinsic lock and an intrinsic condition variable associated with it, this works with any synchronised function by acquiring the lock for any variable used in the function. For example, a class that updates a count variable every time it completes a line would use a synchronised method to update the variable.
The other method is to use the condition variable, which contains the wait(), notify(), and notifyAll() methods that can be used as the wait(), signal() and broadcast() methods respectively.
*/

//c)

public class Semaphore {
    private int count;                    // the count value
    public Semaphore(int i){              // initialise the semaphore
        count = i;                        // set the initial value to the provided one
    }
    public void wait(){                   // wait for the semaphore to be signalled
        while(count <= 0){}               // wait for count to return to 0
        decrement();                      // decrement the value
    }
    public synchronized void decrement(){ // decrease count, synchronized to avoid concurrency issues
        count --;                         // decrement the count
    }
    public synchronized void signal(){    // signal the semaphore, synchronised to avoid concurrency issues
        count ++;                         // increment the count
    }
}
