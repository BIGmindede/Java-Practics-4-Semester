package P2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {
    List<Human> humans =  new ArrayList<>(10);
    public App() {
        humans.add(new Human(27, "Andy", "Panda",  LocalDate.of(1992,12,13),79));
        humans.add(new Human(19, "Stanislav", "Sidorov",  LocalDate.of(1983,1,21),81));
        humans.add(new Human(32, "Yaroslav", "Akatiev",  LocalDate.of(1992,7,5),90));
        humans.add(new Human(11, "Alex", "Pugachev",  LocalDate.of(1992,9,13),59));
        humans.add(new Human(28, "Fonar", "Stolbov",  LocalDate.of(1992,3,13),192));
        humans.add(new Human(17, "Vehicle", "Carov",  LocalDate.of(1992,5,13),500));
        humans.add(new Human(55, "Fly", "Airplaneov",  LocalDate.of(1992,8,13),30));
        humans.add(new Human(43, "Some", "Undefinedov",  LocalDate.of(1992,1,13),49));
        humans.add(new Human(62, "Noname", "Anonimov",  LocalDate.of(1992,7,13),10));
        humans.add(new Human(9, "Arkadiy", "Parovozov",  LocalDate.of(1992,9,13),99));
    }

    public void printList() {
        Stream<Human> stream = humans.stream();
        stream.forEach(System.out::println);
    }

    public void sortScndLetterReversed() {
        Stream<Human> stream = humans.stream();
        stream.sorted((a,b) -> b.lastName.substring(1,2).compareTo(a.lastName.substring(1,2))).forEach(System.out::println);
    }

    public void filterByWeightOver60() {
        Stream<Human> stream = humans.stream();
        stream.filter(a -> a.weight > 60).forEach(System.out::println);
    }

    public void sortByAge() {
        Stream<Human> stream = humans.stream();
        stream.sorted((a,b) -> a.age - b.age).forEach(System.out::println);
    }

    public void multAllAges() {
        Stream<Integer> stream = humans.stream().map(a -> a.getAge());
        System.out.println(stream.reduce((acc,value) -> acc * value));
    }

}
