package Generic_Обобщения.LessonGenerics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Слияние списков.
 */
public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5,9);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 5,3,56,7,8);

        ArrayList<Integer> resultMerge = new ArrayList<>();
        // добавление списка элементов
        resultMerge.addAll(list1);
        resultMerge.addAll(list2);
        StringBuilder builder = new StringBuilder();

        // быстрый for (iter) по всем элементам, только для коллекций
        for (Integer i : resultMerge) {
            System.out.print(i + "_");
        }
    }
}
