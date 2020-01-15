package Cycles;

class BreakLoop {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            if(i==5) break;//выход из цикла если i равно 5
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен, т.к. i равна 5");
    }
}/*
   >>>  i: 0
        i: 1
        i: 2
        i: 3
        i: 4
        Цикл завершен, т.к. i равна 5
*/

