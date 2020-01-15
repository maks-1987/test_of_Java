package Patterns.Behavioral.ChainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        // Notifier reportNotifier = new SimpleReportNotifier(ROUTINE); - если писать так, то
        // нужен будет импорт - import static Patterns.Behavioral.ChainOfResponsibility.Priority.ROUTINE;
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        // установить для reportNotifier следующего уведомителя - это email
        // для уведомителя emailNotifier установить следующего - это sms
        // по умолчан отправляется отчет, если что то важное - и отчет и емаил
        // и если что то оч важное - отчет, емаил и смс
        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything ok.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("We have a problem!", Priority.ASAP);

    }
}/*
>>>     Notifying using simple report: Everything ok.
        Notifying using simple report: Something went wrong
        Sending email: Something went wrong
        Notifying using simple report: We have a problem!
        Sending email: We have a problem!
        Sending SMS to manager: We have a problem!
*/
