package lab_08.visitor;

// Имеем реализацию интерфейса visitor - concreteVisitor, через которую можем получить доступ к конкретным элементами

public class Main {
    public static void main(String[] args) {
        ConcreteElementA concreteElementA = new ConcreteElementA("Hello from A");
        ConcreteElementB concreteElementB = new ConcreteElementB("Hello from B");

        ConcreteVisitor concreteVisitor = new ConcreteVisitor();

        concreteVisitor.visitElementA(concreteElementA);
        concreteVisitor.visitElementB(concreteElementB);
    }
}
