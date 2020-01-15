package Overloads;

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;
    // вызов всех версий метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20) ;
        result = ob.test(123.25);// зайдет в метод и вконце умножит результат
                                    // в след раз при вызове вернет запомненный результ
        System.out.println("\n" + "Результат ob.test(123.25): " + result);
    }
}/*
>>>     Параметры отсутствуют
        а: 10
        а и b: 10 20
        double a: 123.25

        Результат ob.test(123.25): 15190.5625
*/