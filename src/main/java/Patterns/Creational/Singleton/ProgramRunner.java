package Patterns.Creational.Singleton;

class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        // выполнить запись в лог-файл
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        // отобразим содержимое лог-файла
        ProgramLogger.getProgramLogger().showLogFile();
    }
}/*
>>>
        Patterns.Creational.Singleton.ProgramLogger@3ecf72fd
        Patterns.Creational.Singleton.ProgramLogger@3ecf72fd
        Patterns.Creational.Singleton.ProgramLogger@3ecf72fd
        this is log file.

        First log...
        Second log...
        Third log...
*/

