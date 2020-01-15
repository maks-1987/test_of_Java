package Enum;
/**
 * Перечисления автоматически включают два предопределенных метода: values()
 * и valueOf(). Их общая форма выглядит так. Метод values() возвращает массив,
 * содержащий список констант перечисления. Метод valueOf() возвращает константу
 * перечисления, значение которой соответствует строке, переданной в аргументе
 * строка. Программа использует стиль “for-each” цикла for для перебора массива
 * констант, возвращенных методом values(). В целях демонстрации создается
 * переменная allapples, которой присваивается ссылка на массив перечислимых
 * значений. Но это не обязательно, поскольку цикл for можно написать иначе,
 * избежав применения переменной allapples.
 */
class EnumDemo2 {
    public static void main(String args[]) {
        Apple ap; // получили доступ к классу Apple
        System.out.println("Константы Apple: ");
        // применение values()
        Apple[] allappls = Apple.values();
        /* for(Apple a : Apple.values());// Можно так писать для избегания
               System.out.println(a);    // применения переменной allapples
        */
        for(Apple a : allappls)
            System.out.println(a);
        System.out.println();

        // применение valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ар содержит " + ap) ;
    }
}/*
>>>     Константы Apple:
        Jonathan
        GoldenDel
        RedDel
        Winesap
        Cortland

        ар содержит Winesap
*/