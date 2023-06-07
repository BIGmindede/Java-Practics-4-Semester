package P6.AbstractFactory;

public class ConcreteProduct1 implements AbstractProduct{
    int factoryNum;
    ConcreteProduct1(int n) {
        factoryNum = n;
    }
    @Override
    public void info() {
        System.out.printf("Продукт 1 типа из фабрики %n", factoryNum);
    }
}
