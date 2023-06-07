package lab_01;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String str1 = "user@example";
        String str2 = "myhost@@@com.ru";
        Predicate<String> pr = (a) -> a.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        System.out.println(pr.test(str1));
        System.out.println(pr.test(str2));
    }
}