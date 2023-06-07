package lab_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

public class App {
    public void application() {
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human(19, "Danil", "Matrosov", LocalDate.of(2003, 6,5), 73));
        list.add(new Human(11, "Andreu", "Uranov", LocalDate.of(2012, 1,16), 67));
        list.add(new Human(23, "Alina", "Vishneva", LocalDate.of(2000, 3,26), 64));
        list.add(new Human(43, "Nikita", "Khitrov", LocalDate.of(2007, 6,5), 59));
        list.add(new Human(38, "Misha", "Pople", LocalDate.of(2001, 8,24), 90));
        Stream<Human> stream = list.stream();
        stream.sorted((a,b) -> b.getFirstName().charAt(1) - a.getFirstName().charAt(1)).forEach(System.out::println);

        System.out.println();

        Stream<Human> stream1 = list.stream();
        stream1.filter((a) -> a.getWeight() > 60).forEach(System.out::println);

        System.out.println();

        Stream<Human> stream2 = list.stream();
        stream2.sorted((a,b) -> a.getAge() - b.getAge()).forEach(System.out::println);

        System.out.println();

        System.out.println(list.stream().mapToInt(x -> x.getAge()).reduce(1, (a,b) -> a * b));
    }
}
