package lab_05;

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
        System.out.println("Singleton1 object created");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
