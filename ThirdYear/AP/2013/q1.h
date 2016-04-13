typedef struct map Map; /* an instance of a map */
/* create an empty map, returning NULL if unsuccessful */
Map *map_create(void);
/* insert the element <`theKey',`theItem'> into `theMap';
* return 1/0 if successful/unsuccessful
* the insertion is unsuccessful if `the Map' already contains a mapping for `theKey' */
int map_insert(Map *theMap, char *theKey, void *theItem);
/* lookup `theKey' in `theMap', returning the found item as the function
* value; return NULL if not found */
void *map_lookup(Map *theMap, char *theKey);
/* remove the element associated with `theKey' if one exists;
* returns item associated with`theKey' in `*item';
*returns 1 if successful, 0 if no item associated with `theKey' */
int map_remove(Map *theMap, char *theKey, void **item);
/* destroy the map; for each element, if userFunction != NULL,
* it is invoked on the item in that element; the storage associated with the* map is then returned to the heap */
void map_destroy(Map *theMap, void (*userFunction)(void *item));
