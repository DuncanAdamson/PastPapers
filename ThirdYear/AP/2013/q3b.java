/*
b)
*/

public synchronized  void add_to_map(Stirng key, String value, Map m){ // synchronized methods automatically aquire, or wait to aquire, assocciated variable locks, and releases at end.
    if(m.lookup(key)){
        // ... do something
    } else {
        m.add(key, value);
        // ... do other things
    }
}
