package lab_06.Prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2(2);
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1(1);

        Prototype prototype1 = concretePrototype1.clone_();
        Prototype prototype2 = concretePrototype2.clone_();

        System.out.println(prototype1.toString() + " " + prototype2.toString());
    }
}
