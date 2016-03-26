/*
2a)
PThreads have 3 kinds of synchronisation mechanisms, mutex locks, condition variables and semaphores.
Mutex locks are a type of lock variable, providing aquire and release funcitons for locking and unlocking the mutexes resoectivley. These can be used as a simple way of preventing multiple threads accessing the same variable.
Condidtion variables provide the signal and wait functions, allowing threads to wait for the signal, rather than having to busy wait. These are used for situations where a thread would otherwise have to busy wait.
Semaphores are an abstraction combibning mutexes and counting variables, contaning 2 operations, wait and signals, and allow for an arbitary, but finite, amount of threads to have access at once. This can be used best in situations where multiple threads may access the data at once, but certian threads must wait before accessing the data.
b) Only one instance of a synchronization is needed for the main thread to coordinate with another thread. In this case, the mechanism would be initilised such that the relevent thread has access to the data first. This would not require any kind of additional shared data.
*/

//c)

void other(){
    // do something
}

void master(){
    pthread_t *other_thread;
    pthread_create(other_thread, NULL, other, NULL);
    // do something
}

//d)

void other(){
    // do something 
}

void master(){
    pthread_t *other_thread;
    pthread_create(other_thread, NULL, other, NULL);
    pthread_join(other_thread);
    // do something
}
