package ConditionalOperators;

class First {

    static class Cat {
        //String name;
        Cat(String name) {
            //String name;
        }
    }
    private static boolean isALessB(int c, int d) {
        return c > d; //false
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        //Метод передаст значения 100, 101 в метод isALessB и там сравнит
        //А выведет уже результат сравнения - true
        System.out.println(isALessB(100, 101));
        //Происходит сравнение значений (для примитивн типов).
        System.out.println("a == b " + (a == b)); // true

        Cat cat1 = new Cat("Vaska");
        Cat cat2 = cat1;
        //Происходит сравнение ссылок. Переменные хранят ссылки на
        // ОДИН и ТОТ ЖЕ объект.
        System.out.println("cat1 == cat2 " + (cat1 == cat2)); //true

        Cat cat3 = new Cat("Vaska");
        Cat cat4 = new Cat("Vaska");
        //Происходит сравнение ссылок. Переменные хранят ссылки на два
        //идентичных объекта Cat, но не на ОДИН и ТОТ ЖЕ.
        System.out.println("cat3 == cat4 " + (cat3 == cat4)); // false

        Cat cat5 = new Cat("Vaska");
        Cat cat6 = new Cat("Vaska");
        //Происходит сравнение объектов по их ВНУТРЕННЕМУ содержанию
        System.out.println("cat5.equals(cat6) " + cat5.equals(cat6)); // false

        String s = new String("Mama");
        String s2 = new String("Mama");
        //Происходит сравнение объектов по их ВНУТРЕННЕМУ содержанию
        System.out.println("s.equals(s2) " + s.equals(s2)); // true

        boolean m = (a == b);
        if (m)
            System.out.println(a);
    }

}/*
>>>     false
        a == b true
        cat1 == cat2 true
        cat3 == cat4 false
        cat5.equals(cat6) false
        s.equals(s2) true
        5
*/
