package Generic_Обобщения.LessonGenerics;

import java.util.ArrayList;

public class Generics_1 {
    public static void main(String[] args) {
        // Удаление всех чисел больше 5:
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(5);
        list3.add(4);
        list3.add(6);
        for (int i =0; i < list3.size();) {
            if (list3.get(i) > 5) {
                list3.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(list3);
    }
}
