package lab_08.command;

public class ConcreteCommand1 implements Command {

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.receiverMethod1();
    }
}
