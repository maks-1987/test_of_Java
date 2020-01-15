package Patterns.Behavioral.ChainOfResponsibility;

public class EmailNotifier extends Notifier {

    EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
