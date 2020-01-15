package Cycles;

class Switch3 {
    public static void main(String[] args) {

        int amount = 9;

        switch(amount) {
            case     0 : System.out.println("amount is  0"); break;
            case     5 : System.out.println("amount is  5"); break;
            case    10 : System.out.println("amount is 10"); break;
            default    : System.out.println("amount is something else");

        }
        // Если вы хотите, чтобы одна операция выполнялась для нескольких
        // операторов case, вы пишете ее так:
        char key = '\t'; // символы не проверятся, если писать так 't'

        switch(amount) {
            case     ' '  : // выполнение просто пройдет дальше
            case     '\t' : System.out.println("white space char"); break;
            default       : System.out.println("amount is something else2");
            // для первого и второго операторов case выполняется одна и та же
            // операция - операция второго оператора case
        }
    }
}
/*
>> amount is something else
        white space char
        */
