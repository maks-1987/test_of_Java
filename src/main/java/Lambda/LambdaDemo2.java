package Lambda;

class LambdaDemo2 {
    public static void main(String[] args) {

        NumericTest isEven = (n) -> (n % 2)==0;
        if (isEven.test(10)) System.out.println("Number 10 is even");
        if (!isEven.test(19)) System.out.println("Number 19 is not even");

        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("Number 1 is positive");
        if (!isNonNeg.test(-1)) System.out.println("Number -1 is negative");

    }
}/*
        Number 10 is even
        Number 19 is not even
        Number 1 is positive
        Number -1 is negative
*/
