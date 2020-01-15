package Cycles;

public class MoreBreak2 {
    public static void main(String args[]) {
        outer: for(int i=0; i<3; i++) {
            System.out.print("Проход " + i + ": ");
            for(int j =0; j<100; j++) {
                //Когда внутрен. цикл выполняет выход во внешний цикл,
                //это приводит к завершению обоих циклов
                if(j  ==  10)  break outer;//выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены.");
    }
}/*
>>>     Проход 0: 0 1 2 3 4 5 6 7 8 9 Циклы завершены.
*/