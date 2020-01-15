package Cycles;

public class BreakLoop2 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            System.out.println("Проход " + i + ": ");
            for (int j=0; j<100; j++) {
                if (j==10) break;//Осуществит выход только из самого внутреннего цикла
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}/*
>>>     Проход 0:
        0 1 2 3 4 5 6 7 8 9
        Проход 1:
        0 1 2 3 4 5 6 7 8 9
        Проход 2:
        0 1 2 3 4 5 6 7 8 9
        Циклы завершены.
*/