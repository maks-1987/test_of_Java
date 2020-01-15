package SoloLearn;

/**
 * Метод isOddd() должен вернуть "правда", если n нечетно, заполнить пробел
 */
class BooleanTest {
    public static void main(String[] args) {
        System.out.println(isOddd(5));
        System.out.println(isOddd(2));
    }
    private static boolean isOddd(int n) {
        return n % 2 == 1; // заполнить пробел return n%2 == _ ;
    }
}/*
        true
        false
*/