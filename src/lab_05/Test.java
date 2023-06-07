package lab_05;

public class Test {
    public static void main(String[] args) {
        Singleton1 singleton1_1 = Singleton1.getInstance();
        Singleton1 singleton1_2 = Singleton1.getInstance();

        Singleton2 singleton2_1 = Singleton2.getInstance();
        Singleton2 singleton2_2 = Singleton2.getInstance();

        Singleton3 singleton3_1 = Singleton3.getInstance();
        Singleton3 singleton3_2 = Singleton3.getInstance();

    }
}
