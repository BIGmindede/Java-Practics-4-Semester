package Pr8.Visitor;

public class ConcreteElementA implements Element {

    private String greetings;

    public ConcreteElementA(String greetings) {
        this.greetings = greetings;
    }

    @Override
    public void accept() {
        System.out.println("in elem A. " + greetings);
    }
}
