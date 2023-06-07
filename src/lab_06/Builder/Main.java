package lab_06.Builder;

//разбили программу на несколько частей (ConcreteBuilders)
//метод construct у director возвращает сумму двух int-ов, возращаемых builder-ми

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println(director.construct());
    }
}
