package Enum;
// Демонстрация ordinal(), compareTo() и equals()
public class EnumDemo4 {
    public  static void main(String args[]) {
        Apple ap, ap2, ap3;
        // Получить все порядковые значения с помощью ordinal().
        System.out.println("Вот все константы " +
                "и их порядковые значения: ");
        for(Apple а : Apple.values())
            System.out.println(а + " " + а.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();

        // Демонстрация compareTo() и equals()
        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " идет перед " + ap2) ;
        if(ap.compareTo(ap2) > 0)
            System.out.println(ap2  + " идет перед " + ap) ;
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " эквивалентно " + ap3);
        System.out.println();

        if(ap.equals(ap2))
            System.out.println("Error! ");
        if(ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}/*
>>>     Вот все константы и их порядковые значения:
        Jonathan 0
        GoldenDel 1
        RedDel 2
        Winesap 3
        Cortland 4

        GoldenDel идет перед RedDel
        RedDel эквивалентно RedDel

        RedDel equals RedDel
        RedDel == RedDel
*/