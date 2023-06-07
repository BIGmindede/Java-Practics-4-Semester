package lab_05;

public class Singleton2 {
    //Объект instance будет создан classloader-ом во время инициализации класса
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
        System.out.println("Singleton2 object created");
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
