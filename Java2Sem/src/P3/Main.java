package P3;

import java.util.concurrent.Semaphore;

public class Main {

    public static void setThreads() {
        SemaSet semaset = new SemaSet(10);
        Thread t1 =  new Thread(() -> {
            for (int i = 0; i < 10; i++){
                semaset.add(i, "T1");
            }
        });
        Thread t2 =  new Thread(() -> {
            for (int i = 0; i < 10; i++){
                semaset.add(i, "T2");
            }
        });
        Thread t3 =  new Thread(() -> {
            for (int i = 0; i < 10; i++){
                semaset.add(i, "T3");
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }

    public static void mapThreads() {
        SyncMap syncmap = new SyncMap(20);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                syncmap.put(i , Integer.toString(i));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                syncmap.put(i , Integer.toString(i));
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String [] args) {
        setThreads();
    }
}
