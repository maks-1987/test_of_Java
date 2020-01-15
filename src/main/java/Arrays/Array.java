package Arrays;

public class Array {
    public static void main(String args[]) {
        // Объявили массив типа int[] длинной 12 единиц, дали переменной
        // month_days ссылку на массив.
        // Объявление переменной массива можно объединять с распределением
        // самого массива
        int[] month_days = new int[12];// массив из 12-ти целочисл значений
        month_days[0] = 31;// присвоили первому элементу значение 31
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;// третий по номеру ИНДЕКСА элемент выведем на экран
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("В апреле " + month_days[3] + " дней.");
    }
}
