package Patterns.Behavioral.ChainOfResponsibility;

/**
 * Класс-уведомитель
 */
public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    Notifier(int priority) {
        this.priority = priority;
    }

    void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        // если есть цепочка, т.е. следующий уведомитель по цепочке
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }
    // этот метод будет отличаться
    public abstract void write(String message);

}
