package TrainingChoice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Ваше имя: ");
        String name = reader.readLine();

        System.out.println("Введите Ваш вес: ");
        String ves = reader.readLine();
        int nVes = Integer.parseInt(ves);

        System.out.println("Введите Ваш возраст: ");
        String year = reader.readLine();
        int nYear = Integer.parseInt(year);

        if (nVes > 200 | nVes < 5 | nYear > 150 | nYear < 5) {
            System.out.println(name + " Incorrect!!!!! Вес в диапазоне 5-200 кг, возраст 5-150 лет!");
        }else if (nYear <= 18 & nYear >= 5 & nVes <= 60) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-такая тренеровка");
        }else if (nYear <= 18 & nYear >= 5 & nVes > 60) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-сякая тренеровка");
        }else if (nYear <= 40 & nYear > 18 & nVes <= 60) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-тяжелая тренеровка");
        }else if (nYear <= 40 & nYear > 18 & nVes <= 80 & nVes >= 60) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-очень тяжелая тренеровка");
        }else if (nYear <= 40 & nYear > 18 & nVes > 80) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-очень очень тяжелая тренеровка");
        }else if (nYear <= 75 & nYear > 40 & nVes <= 200 & nVes >= 60) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-легкая тяжелая тренеровка");
        }else if (nYear > 75 & nYear <= 150 & nVes <= 200 & nVes >= 60) {
            System.out.println(name + " Для " + nYear + " лет и " + nVes + " кг-прогулки");
        }
    }
}/*        System.out.println("ВВедите Ваше имя ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name+ " введите пожалуйста вашу композицию тела: Толстый, Нормальный либо Худой");

        String body = reader.readLine();
        if (body.equals("Толстый")){
            System.out.println("Вам подойдет жиросжигающая програма");}
        else if (body.equals("Нормальный")){
            System.out.println("Вам подойдет програма для мезоморфа");}
        else if (body.equals("Худой")){
            System.out.println("Вам подойдет програма для набора веса");}
        else{
            System.out.println("Нет такой композиции тела");
        }
*/


