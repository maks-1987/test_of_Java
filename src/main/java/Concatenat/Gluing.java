package Concatenat;

public class Gluing {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //String s = cat.toString(); //вот что произойдет
        //String text = "Cats is " + s; //неявно
        String text = "Cats is " + cat;
        //На самом деле между строк 5 и 8 происходит преобразование в строку посредством
        //неявного вызова метода toString(). То есть, складывая объект,
        //строку и число, то объект и число  будет преобразовано в строку.

        int a = 5;
        //String s = Integer.toString(a);
        //String text2 = "A is " + s;
        String text2 = "A is " + a;

        Cat cat2 = new Cat();

        //String s1 = cat2.toString();
        int a2 = 5;
        //String s2 = Integer.toString(a2);
        String text3 = "Cat is " + cat2 + a2;
        //String text3 = "Cat is " + s1 + s2;
        //System.out.println(a2 + " " + text3);

        Cat cats = new Cat();
        int i = 5;
        //String texts = cats + i + "Cat is " + cats + i;
        //Прогр не скомпилир. Объекты с числами склад нельзя, но если поменять
        //порядок, cats + "Cat is " + i + ..., теперь скомпилир.
    }
    static class Cat {
          Cat() {
            String name = "Vasya";
          }
    }
}
