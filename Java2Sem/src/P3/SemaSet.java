package P3;
import javax.security.auth.callback.Callback;
import javax.xml.namespace.QName;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

interface CB {
    Object call();
}

public class SemaSet implements Set{
    private Set<Object> semaSet;
    private int size;
    private static Semaphore semaphore = new Semaphore(2);

    public SemaSet(int size) {
        this.size = size;
        semaSet = new HashSet<>(size);
    }

    @Override
    public int size() {
        return (int) cb(() -> this.semaSet.size());
    }

    @Override
    public boolean isEmpty() {
        return (boolean) cb(() -> this.semaSet.isEmpty());
    }

    @Override
    public boolean contains(Object o) {
        return (boolean) cb(() -> this.semaSet.contains(o));
    }

    @Override
    public Iterator iterator() {
        return (Iterator) cb(() -> this.semaSet.iterator());
    }

    @Override
    public Object[] toArray() {
        return (Object[]) cb(() -> this.semaSet.toArray());
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    public Boolean add(Object o, String name) {
        return (Boolean) cb(() -> this.semaSet.add(o));
    }

    @Override
    public boolean remove(Object o) {
        return (Boolean) cb(() ->  this.semaSet.remove(o));
    }

    @Override
    public boolean addAll(Collection c) {
        return (boolean) cb(() -> this.semaSet.addAll(c));
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            semaSet.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        return (boolean) cb(() -> this.semaSet.removeAll(c));
    }

    @Override
    public boolean retainAll(Collection c) {
        return (boolean) cb(() -> this.semaSet.retainAll(c));
    }

    @Override
    public boolean containsAll(Collection c) {
        return (boolean) cb(() -> this.semaSet.containsAll(c));
    }

    @Override
    public Object[] toArray(Object[] a) {
        return (Object[]) cb(() -> this.semaSet.toArray(a));
    }

    public Object cb(CB callback) {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + ": " + " took");
            System.out.println(semaSet.toString());
            return callback.call();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + ": " + " released");
            System.out.println(semaSet.toString());
            semaphore.release();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "SemaSet{" +
                "semaSet=" + semaSet.toString() +
                ", size=" + size +
                '}';
    }
}
