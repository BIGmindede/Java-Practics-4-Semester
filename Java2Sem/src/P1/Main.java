package P1;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        Predicate<String> isEmail = (obj) -> {
            Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
            Matcher matcher = pattern.matcher(obj);
            return matcher.matches();
        };
        System.out.println(isEmail.test(st));
    }
}
