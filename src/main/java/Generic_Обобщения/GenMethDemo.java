package Generic_Обобщения;
/**
 * Создание обобщенного метода
 * Методы внутри обобщенного класса могут использовать параметр типа, а
 * следовательно, обобщения относятся также к параметрам методов. Однако
 * можно объявить обобщенный метод, который сам по себе использует один
 * или более параметров типа. Более того, можно объявить обобщенный метод,
 * который включен в непараметризованный (необобщенный) класс.
 */
class GenMethDemo {
    //Определение, содержится ли объект в массиве
    //Обобщенные методы могут быть как статическими, так и нестатическими
    static <T, V extends T> boolean isIn(T x, V[] y) {
        for (int i=0; i < y.length; i++)
            if (x.equals(y[i])) return true;

        return false;
    }
    public static void main(String[] args) {
        //Применение isIn() для Integer
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("2 содержится в nums");
        if (isIn(7, nums))
            System.out.println("7 не содержится в nums");
        System.out.println();

        //Применение isIn() для String
        String[] strs = {"один", "два", "три", "четыре", "пять"};
        if (isIn("два", strs))
            System.out.println("два содержится в strs");

        // He скомпилируется! Типы должны быть совместимыми.
        // if(isIn("два", nums))
        // System.out.println("два содержится в strs ");
        /**
         * Причина в том, что тип параметра типа V ограничен типом параметра
         * типа Т в конструкции extends объявления параметра типа V. Это значит,
         * что параметр V должен иметь либо тип Т, либо тип его подкласса. А в
         * этом случае первый аргумент имеет тип String, но второй — тип Integer,
         * который не является подклассом класса String. Это вызовет ошибку
         * несоответствия типов во время компиляции. Такая способность обеспечивать
         * безопасность типов — одно из наиболее существенных преимуществ обобщенных
         * методов. Синтаксис, использованный для создания метода isIn(), можно
         * обобщить. Вот синтаксис обобщенного метода:
         *
         *  <список_параметров_типа> ссылочный_тип имя_метода(список_параметров)
         *
         * Во всех случаях список_параметров_типа — это разделенный запятыми список
         * параметров типа. Для обобщенного метода список параметров типа
         * предшествует типу возвращаемого значения.
         */
    }
}/*
>>>     2 содержится в nums

        два содержится в strs
*/