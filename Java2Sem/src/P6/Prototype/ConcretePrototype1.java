package P6.Prototype;

public class ConcretePrototype1 implements Prototype{

    int someInfo;

    public ConcretePrototype1(int someInfo) {
        this.someInfo = someInfo;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.someInfo);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "someInfo=" + someInfo +
                '}';
    }
}
