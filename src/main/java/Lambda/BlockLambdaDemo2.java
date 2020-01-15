package Lambda;

class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
          String result = "";
          int i;
          // меняет порядок символов на обратный
          for (i = str.length()-1; i >= 0; i--)
              result+= str.charAt(i);
          return result;
        };
        System.out.println("Lambda cast at " +
                reverse.func("Lambda"));
        System.out.println("Expression cast at " +
                reverse.func("Expression"));
    }
}/*
    Lambda cast at adbmaL
    Expression cast at noisserpxE
    */