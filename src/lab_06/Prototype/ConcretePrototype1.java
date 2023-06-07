package lab_06.Prototype;

public class ConcretePrototype1 implements Prototype {

    private int a;

    public ConcretePrototype1(int a) {
        this.a = a;
    }

    @Override
    public Prototype clone_() {
        return new ConcretePrototype1(this.a);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "a=" + a +
                '}';
    }
}
