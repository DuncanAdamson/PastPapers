#include "q1.h"
#include <stdlib.h>

// 1a)

typedef struct node{   // Node structure
    struct Node *next; // Pointer to next node
    Item item;         // Pointer to item
} Node;

struct set{            // Set structure
    Node *head;        // Pointer to the head of the linked list
    Node *tail;        // Pointer to the tail of the linked list
    isEqual function;  // Pointer to the isEqual funciton
};

struct set_iterator{   // Set_Itterator structure
    Node * pointer     // pointer to the current node
}

// b)

Set *set_create(isEqual fptr){
    Set *s = (Set *)malloc(sizeof(Set));
    s->head = NULL;
    s->tail = NULL;
    s->function = fptr;
    return s;
}

// c)

int set_isElement(Set *s, Item i){
    Node * pointer = s->head;
    while(pointer != NULL){
        if((*(s->function))(i,pointer->item)){
            return 1;
        }
    }
    return 0;
}

// d)

Item set_iterNext(SetIterator *iter){
    if(iter->pointer == NULL){
        return NULL;
    }
    Item i = iter->pointer->item;
    iter->pointer = iter->pointer->next;
    return i;
}

// Other

int main(int argc, char *argv[]){
    return 0;
}
