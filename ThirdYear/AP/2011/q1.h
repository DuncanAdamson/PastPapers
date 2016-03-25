typedef struct queue Queue;     /* an instance of a priority queue */ 
typedef void *Item;             /* items placed in the priority queue */ 
/* priority values must satisfy the following inequalities: 
 * 
 *          MIN_PRIO <= priority <= MAX_PRIO 
 * 
 * i.e. a smaller integer value means a smaller priority */ 
#define MAX_PRIO 100 
#define MIN_PRIO 1 
/* create a priority queue, returning NULL if unsuccessful */ 
Queue *pq_create(void); 
/* add `theItem' to `theQ' with priority `thePrio' 
 * return 1/0 if successful/not-successful */ 
int pq_add(Queue *theQ, Item theItem, int thePrio); 
/* remove the highest priority Item from `theQ' returning it 
 * as the value of the function; return NULL if `theQ’ is empty */ 
Item pq_remove(Queue *theQ); 
