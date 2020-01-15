package CollectionsExample.Example_1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * В контейнер для объектов Apple можно поместить объект одного из субтипов
 * Apple.
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new SortApple1());
        apples.add(new SortApple2());
        apples.add(new SortApple3());
        apples.add(new SortApple4());

        for (Apple c : apples)
            System.out.println(c);
        /*
          Метод add() убеждается в том, что в Collection присутствует
          заданный элемент. Это подразумевает функциональность множества(set)
          для которого элемент добавляется только в случае, если он еще не
          присутствует в контейнере. Для любых List вызов add() всегда эквивалентен
          добавлению, т.к. его объекты НЕ ПРОВЕРЯЮТ наличие дубликатов. Для
          перебора всех контейнеров Коллекции можна применять синтаксис foreach
          либо Итераторов.
         */
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // автоматич упаковка
        for (Integer i : c)
            System.out.print(i+ ", ");
    }
}/*
        Apple{id=0}
        Apple{id=1}
        Apple{id=2}
        Apple{id=3}
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*/
