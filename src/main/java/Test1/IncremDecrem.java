package Test1;

public class IncremDecrem {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));//10, +1
        System.out.println("b--   = " +  (a--));//11, -1
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));//вывод 25 потом прибавит 1 к d (26)
        System.out.println("++d   = " +  (++d));//прибавит 1 к d и выведет 1+26=27
    }
}/*
>>>     a + b = 30
        a - b = -10
        a * b = 200
        b / a = 2
        b % a = 0
        c % a = 5
        a++   = 10
        b--   = 11
        ++d   = 26
*/
