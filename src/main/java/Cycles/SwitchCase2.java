package Cycles;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String args[]){
        System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //в тех случаях, когда необходимо повторять проверку одного и того же
        //значения переменной, есть более элегантное решение с помощью оператора switch.
        switch (number){
            case 1: System.out.println ("Вы ввели число 1"); break;
            case 2: System.out.println ("Вы ввели число 2"); break;
            case 3: System.out.println ("Вы ввели число 3"); break;
            case 4: System.out.println ("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число");
        }
    }
}/*
>>>     Введите 1, 2, 3 или 4
        5
        Вы ввели неправильное число
*/
