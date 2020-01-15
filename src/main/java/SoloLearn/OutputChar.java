package SoloLearn;

class OutputChar {
    public static void main(String[] args) {
        char x = 'B'; // 66
        char y = 'b'; // 98
        char z = 'a'; // 97
        z += x - y;
        /** 65-й символ равен 'A' */
        System.out.println(z);
    }
}
// A