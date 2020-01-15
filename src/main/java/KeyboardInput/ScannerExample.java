package KeyboardInput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //Создаем объект класса Scanner
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Введите целое число: ");
        //Возвращ. истину если с потока ввода можно считать целое число
        if(sc.hasNextInt()) {
            i = sc.nextInt(); //Считывает целое число и сохраняет в переменную
            System.out.println(i * 2);
        }else{
            System.out.println("Вы ввели н целое число");
        }
    }
}
