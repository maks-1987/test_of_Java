package CourseJava.ReqursMet;

/**
 * Рекурсия - вызов метода из самого себя.
 *
 */
public class RecursOne {
    public static void main(String[] args) {
        //Вызов метода f
        f(1);
    }

    private static void f(int i) {
        System.out.print(" " + i); //Распечатали значение 1
        if (i < 7) { //Если значение i < 7 (1<7), то вызываем опять метод 'f'
            f(i + 1); //Тут выполняется вызов метода 'f' из метода 'f'
        }
        //Выведет числа от 7 до 1
        System.out.print(" " + i);
    }
}
/*
>>>     1 2 3 4 5 6 7 7 6 5 4 3 2 1
*/