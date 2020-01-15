package Cycles;

import java.io.IOException;

public class WhileExmp {
        //При компиляц цикл for превращ в while
    public static void main(String[] args) throws IOException {
        int q = 3;
        while(q>=0){
            System.out.println("While "+q);
            q--;
        }
        //Запись цикла, но более компактная
        for (int a = 3; a >= 0; a--){
            System.out.println("for "+a);
        }
        //do while
        int i = 0;
        do {
            System.out.print("do while: "+i+", ");
            i++;
        } while (i < 10);
        System.out.println("i = 10, перевод строки"); //Это можно использовать для простого перевода строки
        //for
        for (int r = 0; r < 10; r++) {
            System.out.print("Ku-Ku ");
        }
        System.out.println();//Просто перенос строки, что бы Ku-Ku не слипалось с "Do...while is cool;"
        do {
            System.out.println("Do...while is cool;");
        } while (2 == 3); //Можно было написать и просто false
        //Цикл выводит слово "Вечность" постоянно, пока есть память
        for (;true;){
            System.out.println("Вечность");
        }
    }
}/*
>>>     While 3
        While 2
        While 1
        While 0
        for 3
        for 2
        for 1
        for 0
        do while: 0, do while: 1, do while: 2, do while: 3, do while: 4, do while: 5, do while: 6, do while: 7, do while: 8, do while: 9, i = 10, перевод строки
        Ku-Ku Ku-Ku Ku-Ku Ku-Ku Ku-Ku Ku-Ku Ku-Ku Ku-Ku Ku-Ku Ku-Ku
        Do...while is cool;
        Вечность
        Вечность
        Вечность
*/

