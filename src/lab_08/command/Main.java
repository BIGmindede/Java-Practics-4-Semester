package lab_08.command;

// имеем два класса команд, каждый из который выполняет отдельный метод Receiver-а
// взаимодействуем с командами через Invoker

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker(command1, command2);

        invoker.executeCommand1Method();
        invoker.executeCommand2Method();
    }
}
