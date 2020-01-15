package CourseJava.SortArray;

import java.util.Arrays;

/**
 * Сортировка ПУЗЫРЬКОМ
 * Алгоритм проходит массив от начала и до конца, сравнивая попарно соседние
 * элементы, Если элементы стоят в неправильном порядке, то они меняются
 * местами, таким образом, после первого прохода на конце массива оказывается
 * максимальный элемент (для сортировки по возрастанию). Затем проход массива
 * повторяется, и на предпоследнем месте оказывается другой наибольший после
 * максимального элемент и т.д. В итоге, наименьший элемент постепенно
 * перемещается к началу массива («всплывает» до нужной позиции как пузырёк в воде).
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, -66, 999, 323, -555, 2323, 44, 7, -9};

        /*Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний
         цикл каждый раз ставит в конец фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

            /*Сравниваем элементы попарно, если они имеют неправильный
            порядок, то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //Приведение элем массва 'arr' к строке и вывод в консоль
        //У класса Arrays вызвали мет toString(), в параметр передали
        //имя нашего массива
        System.out.println(Arrays.toString(arr));
    }
}/*
>>>     [-555, -66, -9, 1, 7, 44, 323, 999, 2323]
*/

