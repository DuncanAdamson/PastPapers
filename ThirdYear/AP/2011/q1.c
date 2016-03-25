#include "q1.h"
#include <stdio.h>
#include <stdlib.h>

// 1 a

typedef struct node{    // Structure for the node
    struct Node * next; // pointer to the next node
    struct Node * last; // pointer to the previous node
    Item * item;        // pointer to the item
    int priority;       // priority of the item
} Node;

struct queue{        // structure for the queue
    Node * sentinel; // pointer to sentinel node
};

// 1 b

Queue *pq_create(void){
    Queue *q = (Queue *)malloc(sizeof(Queue));     // Malloc the pointer
    if(q == NULL){                                 // Check the malloc worked
        return NULL;                               // return NULL if failed
    }
    Node *sentinel = (Node *)malloc(sizeof(Node)); // Malloc the Node 
    if(sentinel == NULL){                          // Check the malloc worked
        return NULL;                               // Return NULL if it failed
    }
    sentinel->next = NULL;                         // Set the sentinel to point to NULL
    sentinel->last = NULL;                         // Set the sentinel to point to NULL
    sentinel->priority = 0;                        // Set to 0 to make comparisons easier
    sentinel->item = NULL;                         // Set the item to NULL
    q->sentinel = sentinel;                        // Set the queue to point to the sentinel
    return q;
}

// 1 c

int pq_add(Queue *q, Item i, int p){
    if( p < MIN_PRIO || p > MAX_PRIO){
        return 0;
    }
    Node *pointer = q->sentinel;
    Node *new = (Node *)malloc(sizeof(Node));
    new->item = &i;
    new->priority = p;
    if(pointer->next==NULL){
        pointer->next = new;
        pointer->last = new;
        new->last = pointer;
        new->next = pointer;
        return 1;
    } else {
        pointer = pointer->next;
        while(pointer->priority > p){
            pointer = pointer->next;
        }
        new->last = pointer->last;
        new->next = pointer;
        pointer->last = new;
        pointer = new->last;
        pointer->next = new;
    }
    return 0;
}

// other functions



int main(int argc, char* argv[]){
    return 0; // Allows compiling for testing
}
