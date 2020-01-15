package Cycles;

public class NestedCycle {
    public static void main(String[] args) {
        int i, j;

        for(i=0; i<5; i++) {
            for(j=i; j<5; j++) { //Пока j=i печатает точки
                System.out.printf(".");
            }
            System.out.println();
        }
    }
}/*
>>> .....
    ....
    ...
    ..
    .
*/