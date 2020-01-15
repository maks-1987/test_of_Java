package Enum;
/**
 * Перечисление — это список именованных констант. B языке Java перечисления
 * могут иметь конструкторы, методы и переменные экземпляра. Перечисления
 * создаются с использованием ключевого слова enum. Идентификаторы Jonathan,
 * GoldenDel и так далее называются константами перечисления. Каждая из них
 * явно объявлена как открытый статический финальный член класса Apple. Более
 * того, их тип — это тип перечисления, в котором они объявлены; в данном случае
 * это Apple. Т.е. в языке Java эти константы называются 'самотипизированными',
 * причем 'само' относится к окружающему перечислению.
 */
class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel; // вызов ENUM-класса Apple, можно сделать импорт статик класса
                            // ap = RedDel - выглядит с импортом
        // Вывод значения enum
        System.out.println("\n" + "Значение ар: " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        // Сравнение двух перечислимых значений
        if(ap == Apple.GoldenDel)
            System.out.println("ар содержит GoldenDel.\n"); // /n - это тоже что написать
                                                            //System.out.println();
        // Применение enum для управления оператором switch
        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println("Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Winesap красный.");
                break;
            case Cortland:
                System.out.println("Cortland красный.");
                break;
        }
    }
}/*
>>>     Значение ар: RedDel

        ар содержит GoldenDel.

        Golden Delicious желтый.
*/