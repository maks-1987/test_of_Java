package Generic_Обобщения.LessonGenerics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LessonGenerics {
    public static void main(String[] args) throws IOException {
        ArrayList arrayList = new ArrayList();
        // можно создать Generic из собственных классов
        ArrayList<MyArrayClass> arrayClasses = new ArrayList<MyArrayClass>();

        // Ввод списка целых чисел с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            arrayList1.add(Integer.parseInt(s));
        }
        // чётные числа добавляются в конец списка, нечётные – в начало
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            String s = reader2.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list.add(x);          //добавление в конец
            else
                list.add(0, x);      //вставка в начало
        }

    }

}
