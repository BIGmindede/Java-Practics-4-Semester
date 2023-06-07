package P6.AbstractFactory;

public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public ConcreteProduct1 createProduct1() {
        return new ConcreteProduct1(1);
    }

    @Override
    public ConcreteProduct2 createProduct2() {
        return new ConcreteProduct2(1);

    }
}
