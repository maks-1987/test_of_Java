package Generic_Обобщения.LessonGenerics;

import java.util.ArrayList;

/**
 * Разделение массива на два – из чётных и нечётных чисел
 */
public class DivideMassive {
    public static void main(String[] args) {
        // статич инициализация массива
        int[] massive = {1,2,2,3,45689093,45,66,57,8,9,0,3457,12,45,2,7,856,65,47,89,5,2145,67322,0,34,24,1};

        ArrayList<Integer> evenList = new ArrayList<>(); // массив с четными числами
        ArrayList<Integer> oddList = new ArrayList<>(); // массив с нечетными числами

        for (int value : massive) {
            if (value % 2 == 0) {
                evenList.add(value);
            } else {
                oddList.add(value);
            }
        }
        System.out.println("Массив с четными числами: " + evenList);
        System.out.println("Массив с нечетными числами: " + oddList);

    }
}
