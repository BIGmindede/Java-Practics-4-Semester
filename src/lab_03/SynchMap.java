package lab_03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchMap implements java.util.Map {

    private Map<Object, Object> synchMap;

    public SynchMap() {
        this.synchMap = new HashMap<>();
    }

    @Override
    synchronized public int size() {
        return 0;
    }

    @Override
    synchronized public boolean isEmpty() {
        return false;
    }

    @Override
    synchronized public boolean containsKey(Object key) {
        return false;
    }

    @Override
    synchronized public boolean containsValue(Object value) {
        return false;
    }

    @Override
    synchronized public Object get(Object key) {
        return synchMap.get(key);
    }

    @Override
    synchronized public Object put(Object key, Object value) {
        return synchMap.put(key, value);
    }

    @Override
    synchronized public Object remove(Object key) {
        return null;
    }

    @Override
    synchronized public void putAll(java.util.Map m) {

    }

    @Override
    synchronized public void clear() {

    }

    @Override
    synchronized public Set keySet() {
        return synchMap.keySet();
    }

    @Override
    synchronized public Collection values() {
        return null;
    }

    @Override
    synchronized public Set<Entry> entrySet() {
        return null;
    }
}
