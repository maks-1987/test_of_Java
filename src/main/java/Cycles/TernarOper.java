package Cycles;

public class TernarOper {
    public static void main(String args[]){
        //Вид:переменная x = (выражение) ? значение if true : значение if false
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
    }
}/*
>>> Значение b: 30
    Значение b: 20
*/
