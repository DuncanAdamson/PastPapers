/*
2)a)
Conditional Critical regions are regions are critical regions, the access to which is controlled by condition variables. This is needed when access to the data is dependent on it's current state. For example, two treads with one writing "1" to the stdout buffer and the other writing "0", with both threads alternating which one writes.
*/

//b)

Mutex m = M_INITIALISOR;     // initialise the mutex
Condition c = C_INITIALISOR; // initialise the condition

void thread_0(){             // Thread 0, prints out 0
    while(true){             // infinite loop
        Lock(m);             // lock the mutex
        printf("0");         // print out "0"
        Unlock(m);           // release the mutex
        Signal(c);           // signal the condition
        Wait(c);             // wait until the condition is signalled
    }
}

void thread_1(){             // Thread 1, prints out 1
    while(true){             // Infinite loops
        Wait(c);             // Wait for condition to be signalled
        Lock(m);             // lock the mutex
        printf("1");         // print out "1"
        Unlock(m);           // release the mutex
        Signal(c);           // signal the condition
    }
}

int main(int argc, char * argv[]){                 // Main function
    pthread_t t0, t1;                              // create the threads
    if(pthread_create(&t0, NULL, thread_0, NULL)){ // initialise the thread
        return 1;                                  // if failed, return 1
    }
    if(pthread_create(&t1, NULL, thread_1, NULL)){ // initialise the thread
        return 1;                                  // if failed, return 1
    }
    pthread_join(t0, NULL);                        // wait for thread 0 to complete
    pthread_join(t1, NULL);                        // wait for thread 1 to complete
    return 0;                                      // return 0
}
