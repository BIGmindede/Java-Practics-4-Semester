package lab_06.AbstractFactory;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("A product created");
        return new ProductA();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("B product created");
        return new ProductB();
    }
}
