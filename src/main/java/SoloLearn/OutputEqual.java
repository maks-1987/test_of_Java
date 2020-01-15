package SoloLearn;

class OutputEqual {
    public static void main(String[] args) {
        String test = new String("test");
        String testAnother = new String("test");

        if (test.equalsIgnoreCase(testAnother)) System.out.println("Equal() String");

        if (test == testAnother) System.out.println("== String");
    }
}
// Equal() String
