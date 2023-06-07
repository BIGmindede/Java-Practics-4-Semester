package P5;

public class Singleton3 {
     private Singleton3() {
          System.out.println("Singleton 3 realization: private constant constructor");
     }
     public static final Singleton3 instance = new Singleton3();

     public void print() {
          System.out.println("Im singleton made with private constant constructor");
     }
}
