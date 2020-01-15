package PrivateMod;

public class Logger {
    //static String format; // статик переменная существует всегда одна
                            // копия переменной, независимо от кол-ва
                            // Экземпляров класса

    private String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
}
class LoggerTest {
    public static void main(String[] args) {
        Logger l = new Logger();
        l.setFormat("U haha");
        // Выводя объект в команд стр получим "путь.logger@..."
        // этого объекта
        System.out.println("l is (" + l + ")" + "and " + l.getFormat());

    }
}
