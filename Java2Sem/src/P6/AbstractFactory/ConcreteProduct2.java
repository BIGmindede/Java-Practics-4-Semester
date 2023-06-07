package P6.AbstractFactory;

public class ConcreteProduct2 implements AbstractProduct{
    int factoryNum;
    ConcreteProduct2(int n) {
        factoryNum = n;
    }
    @Override
    public void info() {
        System.out.println("Продукт 2 типа из фабрики " + factoryNum);
    }
}
