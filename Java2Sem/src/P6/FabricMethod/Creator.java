package P6.FabricMethod;

public class Creator {

    public Product fabricMethod(int n) {
        switch (n) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                throw new IllegalArgumentException("Введен номер несуществующей фабрики: " + n);
        }
    }
}
