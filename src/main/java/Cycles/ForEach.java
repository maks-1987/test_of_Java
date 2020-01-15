package Cycles;
/**
 * Цикл for each это разновидность цикла for, используется для перебора
 * элементов массива или коллекции. в цикле for each тип должен
 * соответствовать типу массива!
 */
public class ForEach {

    //Реализация с помощью for:
/*    public static void main(String[] args) {
        int[] array = {51,136, 387};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }*/

    //Цикл for each не требует ручного изменения переменной - шага для перебора.
    //Цикл автоматически выполняет эту работу.
    public static void main(String[] args) {
        int[] array = {51,136,387};

        for (int i:array) {
            System.out.println(i);
        }
    }
}/*
>>>     51
        136
        387
*/

