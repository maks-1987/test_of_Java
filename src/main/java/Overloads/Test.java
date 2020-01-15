package Overloads;

class Test {
    public static void main (String args[]){
        int a = 100;
        double b = 1.1;
        String c = "vert";
        //Благодаря перегрузке методов мы можем запомнить один
        //метод - add и с помощью него выполнить 3 операции.
        System.out.println(add(a,a));
        System.out.println(add(b,b));
        System.out.println(add(c,c));
        System.out.println(a+b);
        System.out.println(a+=b);
    }
    static int add (int a, int b){
        return a += b;
    }
    static double add (double a, double b){
        return a += b;
    }
    static String add (String a, String b){
        return a.concat(b);
    }
}/*
>>>     200
        2.2
        vertvert
        101.1
        101
*/