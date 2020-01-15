package Patterns.Behavioral.ChainOfResponsibility;

public class SimpleReportNotifier extends Notifier {

    SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
