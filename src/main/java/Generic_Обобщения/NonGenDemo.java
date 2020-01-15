package Generic_Обобщения;

class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;
        // Создать объект NonGen и сохранить
        // Integer в нем. Автоупаковка используется.
        iOb = new NonGen(88);
        // Показать тип данных, используемый iOb.
        iOb.showType();
        // Получить значение iOb. На этот раз приведение необходимо,
        int v = (Integer) iOb.getob();
        System.out.println("значение: " + v);
        System.out.println();

        // Создать другой объект NonGen и сохранить в нем String.
        NonGen strOb = new NonGen("Тест без обобщений");
        // Показать тип данных, используемый strOb.
        strOb.showType();
        // Получить значение strOb.
        // Опять же — приведение необходимо.
        String str = (String) strOb.getob();
        System.out.println("Значение: " + str);
        // Это компилируется, но концептуально неверно!
        iOb = strOb;
        v = (Integer) iOb.getob();// ошибка времени выполнения!
    }
}/*
>>>     Типом ob является java.lang.Integer
        значение: 88

        Типом ob является java.lang.String
        Значение: Тест без обобщений
        Exception in thread "main" java.lang.ClassCastException:
            java.lang.String cannot be cast to java.lang.Integer
            at Generic_Обобщения.NonGenDemo.main(NonGenDemo.java:26)

        Process finished with exit code 1
*/