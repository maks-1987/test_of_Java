package SoloLearn;

public class OutputTryCatch {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < 3; ++i) {
            try {
                n/=i; // 6:0 exception. Next 8:1=8, 8:2=4.
            /** Перехватит деление на ноль, но выполнит n+2 (6+2=8) */
            }
            catch (Exception e) {
                n+=2;
            }
        }
        System.out.println(n);
    }
}
// 4
