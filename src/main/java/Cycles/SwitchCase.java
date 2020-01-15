package Cycles;

public class SwitchCase {
    public static void main(String[] args) {
        int i = 2;
        switch(i) {
            case 1:
                System.out.println("Тест работает.");
                break;// Используя оператор break, можно вызвать немедленное завершение
            // цикла, пропуская условное выражение и другой код в теле цикла
            case 2:
                System.out.println("Тест добрый."); break;
            case 3:
                System.out.println("Тест поможет вам."); break;
        }
        //тоже самое через if else
        int t = 2;
        if(t == 1) { // аналог "case 1"
            System.out.println("Тест работает");
        } else if(t == 2) { // аналог "case 2"
            System.out.println("Тест добрый");
        } else if(t == 3) { // аналог "case 3"
            System.out.println("Тест поможет вам");
        }
        //switch & default
        int x = 4;
        //Оператор break тут оказывает влияние только на данный оператор
        //switch, а не на какие-либо содержащие его циклы
        switch(x) {
            case 1: System.out.println("Тест работает");
            break;//оператор выхода из цикла
            case 2: System.out.println("Тест добрый"); break;
            case 3: System.out.println("Тест поможет вам"); break;
            default://нужен в случае если ни один из вариантов не походит(break не требуется)
                System.out.println("Тест интересный");
        }
    }
}/*
>>>     Тест добрый.
        Тест добрый
        Тест интересный
*/
