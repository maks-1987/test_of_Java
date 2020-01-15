package Generic_Обобщения;

class StatsDemo {
    public static void main(String args[]) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

    // Это не скомпилируется,  потому что String не является подклассом Number.
    // String strs[] = { "1", "2", "3", "4", "5" };
    // Stats<String> strob = new Stats<String>(strs);
    // double x = strob.average();
    // System.out.println("Среднее значение strob равно " + v);
    }
}/*
>>>     Среднее значение iob равно 3.0
        Среднее значение dob равно 3.3
*/