package P2;

public class Main {
    public static void main(String[] args) {
        App Application = new App();

        System.out.println("\nВывод исходного списka");
        Application.printList();

        System.out.println("Сортировkа по 2-ому символу фамилии в обратном порядkе");
        Application.sortScndLetterReversed();

        System.out.println("\nФильтрация по весу больше 60");
        Application.filterByWeightOver60();

        System.out.println("\nСортировkа по возрасту");
        Application.sortByAge();

        System.out.println("\nПроизведение всех возрастов");
        Application.multAllAges();
    }

}
