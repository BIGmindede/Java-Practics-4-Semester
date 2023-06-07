package P6.AbstractFactory;

public class Client {
    private static AbstractFactory f1 = new ConcreteFactory1();
    private static AbstractFactory f2 = new ConcreteFactory2();
    public static AbstractProduct[] getProductsByFactory1() {
        return new AbstractProduct[]{f1.createProduct1(),f1.createProduct2()};
    }

    public static AbstractProduct[] getProductsByFactory2() {
        return new AbstractProduct[]{f2.createProduct1(),f2.createProduct2()};
    }
}
