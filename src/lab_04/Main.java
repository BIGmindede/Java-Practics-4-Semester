package lab_04;

public class Main {
    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second move");
        });

        executorService.execute(() -> System.out.println("First move"));
        executorService.shutdown();
    }
}
