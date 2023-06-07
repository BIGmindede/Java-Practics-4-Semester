package Pr8.Visitor;

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
