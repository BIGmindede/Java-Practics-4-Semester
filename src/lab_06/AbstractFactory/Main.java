package lab_06.AbstractFactory;

// создаем объекты почти одинаковые на разных фабриках

public class Main {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();

        concreteFactory.createProductA();
        concreteFactory2.createProductA();

        concreteFactory.createProductB();
        concreteFactory2.createProductB();
    }
}
