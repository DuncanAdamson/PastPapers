#include <"q1.h">
#include <stdout.h>
#include <string.h>

/*
a)
*/
typedef struct node{    // Node for the linked list
    struct Node * next; // Pointer to the next node
    void * element;     // Pointer to the element
    char * key;      // Pointer to the key for lookup
} Node;

struct map{             // Map structure
    Node * head;        // Pointer to the head of the list
}

/*
b)
*/

Map *map_create(void){
    Map * map = (map *)malloc(sizeof(map));    // Malloc the map
    Node * head = (Node *)malloc(sizeof(Node)); // Malloc the node
    head->next = NULL;                  // Set the next node to null
    head->element = NULL;               // Set the element to null
    head->key = NULL;                   // Set the key to null
    map->head = head;                   // Set the maps head to the node created here
    return map;                         // Return the map
}

/*
c)
*/

void *map_lookup(Map *theMap, char *theKey){
    Node n = theMap->head;                            // Pointer to the current node
    while(n != NULL && strcmp(n->key, theKey) != 0){  // While not found the key, and still in scope of the list
        n = n->next;                                  // Get the next node
    }
    if(n == NULL){                                    // If the key did not exist
        return NULL;                                  // Return NULL
    } else {                                          // Else, there was the key
        return n->element;                            // return the element
    }
}

/*
d)
*/

void map_destory(Map *theMap, void(*userFunction)(void *item)){
    Node n = theMap->head;                // Start at the head
    while(n != NULL){                     // Whilst the pointer is not null
        if(userFunction != NULL){         // If the user function is not null
            (*userFunction)(n->element);  // Preform it on the item
        }
        Node tmp = n->next;               // set tmp to be the next node
        free(n);                          // free the current node
        n = tmp;                          // set the current node to be tmp
    }
    free(theMap);                         // Free the map
}

/*
e)
*/

int main(){
    Map * map = map_create();           // Create the map
    map_insert(map."barrack","obama");  // Insert the element with the key
    map_destroy(map);                   // Destroy the map
    return 0;                           // End the function
}
