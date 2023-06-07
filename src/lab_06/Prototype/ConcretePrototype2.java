package lab_06.Prototype;

public class ConcretePrototype2 implements Prototype {

    private int a;

    public ConcretePrototype2(int a) {
        this.a = a;
    }

    @Override
    public Prototype clone_() {
        return new ConcretePrototype2(this.a);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "a=" + a +
                '}';
    }
}
