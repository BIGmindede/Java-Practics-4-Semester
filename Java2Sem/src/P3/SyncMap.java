package P3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SyncMap implements Map<Object, Object> {

    private Map<Object, Object> syncMap;
    private int size;

    public SyncMap(int size) {
        this.size = size;
        syncMap = new HashMap<Object, Object>(size);
    }

    @Override
    public synchronized int size() {
        return this.size;
    }

    @Override
    public synchronized boolean isEmpty() {
        return size == 0;
    }

    @Override
    public synchronized boolean containsKey(Object key) {
        return syncMap.containsKey(key);
    }

    @Override
    public synchronized boolean containsValue(Object value) {
        return syncMap.containsValue(value);
    }

    @Override
    public synchronized Object get(Object key) {
        return syncMap.get(key);
    }

    @Override
    public synchronized Object put(Object key, Object value) {
        System.out.println(Thread.currentThread().getName() + ": key - " + key + "val - "  + value);
        return syncMap.put(key, value);
    }

    @Override
    public synchronized Object remove(Object key) {
        return syncMap.remove(key);
    }

    @Override
    public synchronized void putAll(Map<?, ?> m) {
        syncMap.putAll(m);
    }

    @Override
    public synchronized void clear() {
        syncMap.clear();
    }

    @Override
    public synchronized Set<Object> keySet() {
        return syncMap.keySet();
    }

    @Override
    public synchronized Collection<Object> values() {
        return syncMap.values();
    }

    @Override
    public synchronized Set<Entry<Object, Object>> entrySet() {
        return syncMap.entrySet();
    }
}
