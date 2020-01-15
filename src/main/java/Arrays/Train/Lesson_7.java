package Arrays.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список строк.
 * 2. Добавь в него 5 различных строчек.
 * 3. Выведи его размер на экран.
 * 4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки.
 * Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 */
public class Lesson_7 {
    public static void main(String[] args) throws IOException {
        // 1
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 2
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        // 3
        System.out.println("Size: " + list.size());
        // 4 - (forEach)
        for (String l : list) {
            System.out.println(l);
        }
        // 4 (for loop) в обратн порядке
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }

        for (int i = 0; i < list.size(); i++) {
            String s = null;
            list.add(4, s);

        }
    }
}
