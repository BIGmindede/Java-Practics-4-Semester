package P6.Prototype;

public class ConcretePrototype2 implements Prototype{

    int someInfo;

    public ConcretePrototype2(int someInfo) {
        this.someInfo = someInfo;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.someInfo);
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "someInfo=" + someInfo +
                '}';
    }
}
