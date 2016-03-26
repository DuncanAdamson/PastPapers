typedef struct set Set
;
/* an instance of a 
set
*/
typedef void *Item;
/* items placed in the 
set
*/
/* function prototype that compares two Item’s for equality
* returns 1 if equal, 0 if not */
typedef int (*isEqual)(Item i1, Item i2);
typedef struct set_iterator SetIterator;
/* create a 
set
, returning NULL if unsuccessful
* f is the equality test function used to maintain element uniqueness
*/
Set *set_create(isEqual f);
/* destroy the set `s’ */
void set_destroy(Set *s);
/* add `i' to `s', return 1/0 if successful/not-successful*/
int set_add(Set*s, Item i);
/* remove `i’ from `s’ if it is an element of the set */
void set_remove(Set*s, Item i);
/* determine if `i’ is an element of `s’, returning 1/0 if true/false */
int set_isElement(Set *s, Item i);
/* create an iterator over the Set `s’; returns NULL if unsuccessful */
SetIterator *set_iterCreate(Set *s);
/* return the next Item in the Set from which the iterator was created;
* returns NULL if there are no mor
e Item’s in the Set */
Item set_iterNext(SetIterator *iter);
/* destroy `iter’ */
void set_iterDestroy(SetIterator *iter);
