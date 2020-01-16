package CollectionsExample.Iterator_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Iterator<Integer> iterator = integerList.iterator();
        /** Только тут можем удалять элем во время итерации */
        int count = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (count == 1) iterator.remove(); // не приним аргум, т.к. проходя по списку можем удалить только текущ элемент
            count++;
        }
        System.out.println(integerList);

        for (int x : integerList) {
            //integerList.remove(1); // Exception in thread "main" java.util.ConcurrentModificationException
            System.out.println("\t" + x);
        }
    }
}
