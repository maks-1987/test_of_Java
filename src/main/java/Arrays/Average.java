package Arrays;

public class Average {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 12.4, 13.4, 14.5};
        double result = 0;// присвоим значение 0, т.к. в цикле нельзя
                          // использ. пустые переменные
        int i;// в цикле будет служить как индекс массива
        for(i=0; i<6; i++)
            result = result + nums[i];// 0 + 10.1 ...

        System.out.println("Srednee znachenie = " + result/6);
    }
}/*
>>>     Srednee znachenie = 12.316666666666665
*/