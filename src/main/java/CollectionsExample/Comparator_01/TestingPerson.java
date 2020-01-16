package CollectionsExample.Comparator_01;

import java.util.*;

public class TestingPerson {
    public static void main(String[] args) {
        /** Сортировка числовых литералов */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2); // по умолчанию метод sort() сортирует в прямом возрастающ порядке - 1,2,3...
        integerList.add(3);
        integerList.add(4);
        integerList.add(22);
        integerList.add(10);
        /** Сортировать с помощью Анонимного класса (или лямбды), чтобы не создавать отдельн класс со своей реализацией */
        /*Collections.sort(integerList, (o1, o2) -> {
            // своя реализация
            return 0;
        });*/
        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // своя реализация
                return 0;
            }
        });
        System.out.println("Sorting integerList " + integerList);
        /** Сортировка строковых литералов */
        List<String> stringList = new ArrayList<>();
        stringList.add("sas"); // строки сортир по алфавитному порядку - а,аа,аб,в...
        stringList.add("a");
        stringList.add("abcd");
        stringList.add("aas");
        Collections.sort(stringList, new StringLengthCompare());
        System.out.println("Sorting stringList " + stringList);

        /** Сорт своих объектов */
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(2, "Vasya"));
        personList.add(new Person(3, "Petruha"));
        personList.add(new Person(1, "Alex"));
        Collections.sort(personList, (o1, o2) -> {
            if (o1.getName().length() > o2.getName().length()) {
                return 1;
            } else if (o1.getName().length() < o2.getName().length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(personList);

        /** Сорт своих объектов List, Set */
        List<Person> personList2 = new ArrayList<>();
        Set<Person> personList3 = new TreeSet<>();
        addElem(personList2);
        addElem(personList3);
        Collections.sort(personList2);
        // Collections.sort(personList2); // Деревья сами сортируются и без Collections.sort
        System.out.println("personList_2 " + personList2);
        System.out.println("personList_3 " + personList3);
    }

    private static void addElem(Collection collection) {
        collection.add(new Person(2, "Lesya"));
        collection.add(new Person(5, "Oleh"));
        collection.add(new Person(1, "Gennadij"));
    }
}

class StringLengthCompare implements Comparator<String> {
    /**
     * Можно указать свою логику сортировки для метода sort()
     * Когда реализуем этот метод, наш класс станет Компаратором и объект этого класса мож передавать в sort()
     */
    @Override
    /** Конвенция этого метода такая: (это можно изменить переставив знак "-" и сортир будет в убывающ порядке)
     * - если о1 > о2 вернется 1
     * - если о1 < о2 вернется -1
     * - если о1 = о2 вернется 0 */
    public int compare(String o1, String o2) { // сравнить по длинне строки
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}