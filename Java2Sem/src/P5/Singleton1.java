package P5;

public class Singleton1 {
    Singleton1 instance;
    public Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }
}
