package lab_08.command;

public class Invoker {
    private Command command1;
    private Command command2;

    public Invoker(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void executeCommand1Method() {
        command1.execute();
    }

    public void executeCommand2Method() {
        command2.execute();
    }
}
