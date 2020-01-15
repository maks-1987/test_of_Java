package AboutClasses;
/**
 * Таким образом, в строке -  Box myboxl = new Box(); оператор new Box()
 * вызывает конструктор Box(). Если конструктор класса не определен явно,
 * Java создает для класса конструктор, который будет использоваться по
 * умолчанию. Конструктор, используемый по умолчанию, инициализирует все
 * переменные экземпляра нулевыми значениями.
 */
public class BoxDemo3 {
    public static void main(String args[]) {
    // объявление, резервирование и инициализация объектов Box
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
    // получение объема первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем равен " + vol);
    // получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}/*
>>>     Конструирование объекта Box
        Конструирование объекта Box
        Объем равен 1000.0
        Объем равен 1000.0
*/