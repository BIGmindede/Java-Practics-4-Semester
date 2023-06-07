package lab_06.AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("A2 product created");
        return new ProductA();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("B2 product created");
        return new ProductB();
    }
}
