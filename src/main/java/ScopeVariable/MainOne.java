package ScopeVariable;
/**
 * Имена перемен. метода и класса могут совпадать.Если в методе видны (доступны)
 * несколько переменных, напр. переменная класса и перем. метода, то обращение
 * произойдет к переменной метода. Перем. метода закрывает собой переменную класса.
 * Т. е. обращение будет происходить к перем. метода. К перем. класса можно
 * обращаться, но сложным образом. Для static - перем. класса: ClassName.varName
 * Для обычной перем. класса: this.varName
 */
class MainOne {
    public static void main(String[] args) {
        run();
        Cat cat = new Cat();
        cat.run2();
    }
    static int count = 0;
    static void run() {
        count = 5;
        int count = 10;
        count++;
        System.out.println(count);
        //Обращение к static перем. класса
        System.out.println(MainOne.count);
    }
    private static class Cat {
        int catsCount = 1;
        void run2() {
            catsCount = 100;
            int catsCount = 200;
            catsCount++;
            System.out.println(catsCount);
            //Обращение к обычной перем класса
            System.out.println(this.catsCount);
        }
    }
}/*
>>  11
    5
    201
    100
*/