/*
c)
*/

typedef struct node{
    struct Node * next;
    struct Node * last;
    char * element;
} Node;

struct TSMyQueue{
    Node * head;
    Node * tail;
    pthread_mutex_t * in_use;
}

TSMyQueue * tsmq_create(void){
    TSMyQueue * q = (TSMyQueue *)malloc(sizeof(TSMyQueue));
    q -> head = NULL;
    q -> tail = NULL;
    q -> in_use = PTHREAD_MUTEX_INITILIZER;
}

int tsmq_add(TSMyQueue *mq, char *entry){
    if(pthread_mutex_lock(mq -> in_use) != 0){
        return 0;
    }
    Node * new = (Node *)malloc(sizeof(Node));
    new -> element = entry;
    new -> next = NULL;
    new -> last = NULL;
    if( mq -> head == NULL ){
        mq -> head = new;
        mq -> tail = new;
    } else {
        mq -> tail -> next = new;
        new -> last = mq -> tail;
        mq -> tail = new;
    }
    if(pthread_mutex_unlock(mq -> in_user) != 0){
        return 0;
    } else {
        return 1;
    }
}

char * tsmq_remove(TSMQueue *mq){
    if(pthread_mutex_lock(mq -> in_use) != 0){
        return NULL;
    }
    if(mq -> head == NULL){
        return NULL;
    } else {
        Node * n = mq -> head;
        mq -> head = n -> next;
        mq -> head -> last = NULL;
        if(pthread_mutex_unlock(mq -> in_use) != 0){
            return NULL;
        } else {
            char * c = n -> element;
            free(n);
            return c;
        }
    }
}
