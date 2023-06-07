package lab_05;

public class Singleton3 {
    private Singleton3() {
        System.out.println("Singleton3 object created");
    }

    private static class SingletonHolder {
        private final static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }
}
