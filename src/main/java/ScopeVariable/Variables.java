package ScopeVariable;

class Variables {
    //Статич. переменные классов существ ВСЕ ВРЕМЯ работы программы
    //Их видимость также определяется модиф. доступа
    private static String TEXT = "The end.";
    //Перем.-аргументы метода существуют ВЕЗДЕ внутри метода
    public static void main(String[] args) {
        System.out.println("Hi!");
        //Перемен, оъявленная в методе, существует с начала объявлен. и до конца метода
        String s = "Hi!!!!!!";
        System.out.println(s);

        if(args != null)
        {//Перемен., объявленная в блоке кода (цикла), существ до конца блока этого кода
            String s2 = s;
            System.out.println(s2);
        }
        Variables var = new Variables();
        System.out.println(var.classVariable);
        System.out.println(TEXT);
    }
    //Перем. класса.объекта существуют все время жизни содержащего их объекта.
    //Их видимость дополнит. регулируется модиф. доступа: public, private
    String classVariable;
    //конструктор
    Variables() {
        classVariable = "Class variable test, I haaaa";
    }
}/*
>>>     Hi!
        Hi!!!!!!
        Hi!!!!!!
        Class variable test, I haaaa
        The end.
*/
