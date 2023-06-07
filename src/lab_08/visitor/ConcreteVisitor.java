package lab_08.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitElementA(ConcreteElementA concreteElementA) {
        concreteElementA.accept();
    }

    @Override
    public void visitElementB(ConcreteElementB concreteElementB) {
        concreteElementB.accept();
    }
}
