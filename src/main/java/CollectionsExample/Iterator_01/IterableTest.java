package CollectionsExample.Iterator_01;

import java.util.ArrayList;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        for (int x : integerList) {
            System.out.println(x);
        }
     }
}
