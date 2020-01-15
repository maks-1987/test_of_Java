package ScopeVariable;

public class Scope {
    public static void main(String[] args) {
        for(int x=0; x<10; x++) {
            System.out.println(x);
        }
        // x существует только внутри {цикла}, затем он удаляется
        // по окончию работы цикла. Расскомент строки даст Error
        //System.out.println(x);
    }
}
class Test {
    public static void main(String args[]) {
        {
            int a = 5;
            {
                //Переменная уже лбъявлена - ошибка. Если
                //раскоммент след строку
                //int a = 10;
                System.out.println(a);
            }
        }
    }
}