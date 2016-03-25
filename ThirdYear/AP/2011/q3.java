/*
3a)
The first mechism is to create a class which extends the thread class, and overwrite the run() method with the new method to be the new one to be run.
The second method is to create a class that implements the runnable interface, with the run method being the funtion to be run as the thread. This class is then wrapped in a thread to allow running.
The second method is the preffered method for use in Java. This is because it more general due to it allowing the subclassing of another class.
b)
All Java objects have an intrinsic lock and an intrisic condition variable assocciated with it, this works with any schynronised function by aquiring the lock for any vairiable used in the function. For exampe, a class that updates a count variable everytime it completes a line would use a schyronised method to update the variable.
The other method is to use the condion variable, which contains the wait(), notify(), and notifyAll() methods that can be used as the wait(), signal() and broadcast() methods resoectively.
*/

//c)

public class Semaphore {
    private int count;                    // the count value
    public Semaphore(int i){              // initilise the semaphore
        count = i;                        // set the initil value to the provided one
    }
    public void wait(){                   // wait for the semaphore to be signaled
        while(count <= 0){}               // wait for count to return to 0
        decrement();                      // decrement the value
    }
    public synchronized void decrement(){ // decrease count, synchronized to avoid concurrency issues
        count --;                         // decrement the count
    }
    public synchronized void signal(){    // signal the semaphore, synchronised to avoid concurency issues
        count ++;                         // increment the count
    }
}
