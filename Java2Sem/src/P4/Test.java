package P4;

import java.util.concurrent.ExecutorService;

public class Test {
    public static void main(String[] args) {
        ExecutorService myEx = new MyExecutors(1);
        myEx.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Started");
        });
        myEx.submit(() -> {
            System.out.println("Running");
        });

        myEx.shutdown();
    }
}
