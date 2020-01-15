package Patterns.Creational.Singleton;

class ProgramLogger {
    private static ProgramLogger programLogger;// создали экземпл Логгера
    private static String logFile = "this is log file. \n\n";

    private ProgramLogger() {

    }

    // создать метод, котор будет возвращ экземпл Логгера
    // метод доступен из разных потоков
    static synchronized ProgramLogger getProgramLogger() {
        if  (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    // Принимает ту инфу, что хотим занести в лог-файл
    void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }
    // Будет выводить содержимое Лога
    void showLogFile() {
        System.out.println(logFile);
    }
}
