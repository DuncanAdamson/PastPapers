/*
3a) One could use a simple container struct which, at creation, preforms a single malloc for the element size which, as it is fixed, could simply be overridden at each new element from the stack. Similarly this would be freed only once at the end of the execution, thus saving most of the Malloc and Free calls.
*/
typedef struct container{
    void * element;
} Container;

Container * create_container(size_t size){
  Container * c = (Container *)malloc(sizeof(container));
  c -> element = (void *)malloc(size);
}

void new_element(Container * c, void * element){
  c -> element = element;
}

void destroy(Container * c){
    free(c -> element);
    free(c);
}

/*
b) see q3b.java
*/
/*
c) YACC is not covered in either this, or PL so no answers to this question, unless someone else REALLY want to answer it.
*/
