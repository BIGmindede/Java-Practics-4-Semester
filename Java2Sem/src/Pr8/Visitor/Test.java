package Pr8.Visitor;

public class Test {
    public static void main(String[] args) {
        ConcreteElementA concreteElementA = new ConcreteElementA("Hello from A");
        ConcreteElementB concreteElementB = new ConcreteElementB("Hello from B");


        ConcreteVisitor concreteVisitor = new ConcreteVisitor();

        concreteVisitor.visitElementA(concreteElementA);
        concreteVisitor.visitElementB(concreteElementB);
    }
}
