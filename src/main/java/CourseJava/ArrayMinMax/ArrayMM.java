package CourseJava.ArrayMinMax;

/**
 * Поиск мин и макс значения массива
 * Использовался цикл foreach (улучшенный for)
 */
class ArrayMM {
    public static void main(String[] args) {
        int[] arr = {0, 21, 32, -888, 12, 54, 65, 1, 90, 999, -1};
        //Представим будто 0-индекс массива это мин и макс. После
        //сравним их в цикле if с кажд индексом массива
        int max = arr[0], min = arr[0];

        for (int i : arr) { //(int i=0; i < arr.length; i++)
            //max = i > max ? i : max; - тоже самое, но менее понятно
            if (i > max)
                max = i;
            //min = i < min ? i : min; - тоже самое, но менее понятно
            if (i < min)
                min = i;
        }
        System.out.println("Max numb: " + max);
        System.out.println("Min numb: " + min);
    }
}/*
>>>     Max numb: 999
        Min numb: -888
*/
