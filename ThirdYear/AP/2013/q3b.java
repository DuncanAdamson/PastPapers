/*
b)
*/

public synchronized  void add_to_map(Stirng key, String value, Map m){ // synchronized methods automatically acquire, or wait to acquire, associated variable locks, and releases at end.
    if(m.lookup(key)){
        // ... do something
    } else {
        m.add(key, value);
        // ... do other things
    }
}
