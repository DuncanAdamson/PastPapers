/*
c)
*/

/* Alternate below, without re-implementing everything */

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
    pthread_mutex_init(&q -> in_use, NULL); //PTHREAD_MUTEX_INIT can't be used on a struct like it was
}

int tsmq_add(TSMyQueue *mq, char *entry){
    if(pthread_mutex_lock(&mq -> in_use) != 0){
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
    if(pthread_mutex_unlock(&mq -> in_user) != 0){
        return 0;
    } else {
        return 1;
    }
}

char * tsmq_remove(TSMQueue *mq){
    if(pthread_mutex_lock(&mq -> in_use) != 0){
        return NULL;
    }
    if(mq -> head == NULL){
        return NULL;
    } else {
        Node * n = mq -> head;
        mq -> head = n -> next;
        mq -> head -> last = NULL;
        if(pthread_mutex_unlock(&mq -> in_use) != 0){
            return NULL;
        } else {
            char * c = n -> element;
            free(n);
            return c;
        }
    }
}

/* Alternate */
/* --------- */
#include "some_queue_header.h"

struct tsmyqueue
{
    MyQueue         * q;
    pthread_mutex_t   lock;
}


TSMyQueue *tsmq_create() {
    TSMyQueue q* = (TSMyQueue *) malloc(sizeof(TSMyQueue));
    if(!q) {
        return NULL;
    }

    q->q = mq_create();
    if(!q->q) {
        free(q);
        return NULL; 
    }

    pthread_mutex_init(&q->lock, NULL);

    return q;
}

int tsmq_add(TSMyQueue *mq, char *entry){
    if(pthread_mutex_lock(&mq -> lock) != 0){
        return 0;
    }

    mq_add(&mq->q, entry);

    if(pthread_mutex_unlock(&mq -> lock) != 0){
        return 0;
    } else {
        return 1;
    }
}

char * tsmq_remove(TSMQueue *mq){
    char *entry = NULL;

    if(pthread_mutex_lock(&mq -> in_use) != 0){
        return NULL;
    }

    entry = mq_remove(&mq -> q);

    pthread_mutex_unlock(&mq -> lock) != 0);
    return entry;
}