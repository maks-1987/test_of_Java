package Patterns.Behavioral.ChainOfResponsibility;

public class SMSNotifier extends Notifier {

    SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
