package Generic_Обобщения;

/**
 * В этом случае класс Integer подставляется вместо параметра Т, а класс
 * String — вместо параметра V. Хотя два аргумента в примере отличаются,
 * допустимо передать в параметрах два одинаковых типа.
 */
class TwoGenDemo {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>
                                         (88, "Обобщения");
        // Показать типы.
        tgObj.showTypes();
        // Получить и показать значения,
        int v = tgObj.getob1();
        System.out.println("Значение: " + v);
        String str = tgObj.getob2();
        System.out.println("Значение: " + str);
    }
}/*
>>>     Тип T: java.lang.Integer
        Тип V: java.lang.String
        Значение: 88
        Значение: Обобщения
*/