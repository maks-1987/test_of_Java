package Generic_Обобщения;

class WildcardDemo {
    public static void main(String args[]) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats2<Integer> iob = new Stats2<Integer>(inums);

        double v = iob.average();
        System.out.println("Среднее для iob равно " + v);
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats2<Double> dob = new Stats2<Double>(dnums);

        double w = dob.average();
        System.out.println("Среднее для dob равно " + w);
        Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats2<Float> fob = new Stats2<Float>(fnums);

        double x = fob.average();
        System.out.println("Среднее для fob равно " + x);

        // Посмотреть, какие массивы имеют одинаковые средние.
        System.out.print("Средние iob и dob ");
        if(iob.sameAvg(dob))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");
        System.out.print("Средние iob и fob ");
        if(iob.sameAvg(fob))
            System.out.println("равны.");
        else
            System.out.println("отличаются.");
    }
}/*
>>>     Среднее для iob равно 3.0
        Среднее для dob равно 3.3
        Среднее для fob равно 3.0
        Средние iob и dob отличаются.
        Средние iob и fob равны.
*/