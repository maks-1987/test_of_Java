package CallFunc;

public class CallFun {
    public static void main(String[] args) {
        //Из статик методов можно звать только статик методы
        //Передаем в метод тип данных, описанный в методе, т.е. String
        print4("Java lang");
    }
    //Метод приним тип данных String, затем работает - выводит 4 раза эту строку
    public static void print4(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
