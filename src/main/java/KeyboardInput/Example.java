package KeyboardInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число: ");
        String age = br.readLine();
        System.out.println("Введите ИМЯ: ");
        String name = br.readLine();
        long nAge = Integer.parseInt(age);
        System.out.println(name+" захватит МИР через "+nAge+" лет");
        //Работа тернарного оператора
        System.out.println(age.equals(name) ? "Это не выводится на экран":"А это выведется! Т.к. " +
                "ссылки на строки не равны");
    }
}/*
>>>     Введите число: 5
        Введите ИМЯ: имя
        имя захватит МИР через 5 лет
        А это выведется! Т.к. ссылки на строки не равны
*/
