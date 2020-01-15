package Threads.CooperationThr;

public class PC {
    public static void main(String[] args) {
        Q q = new Q(); // получили ссылку q для манипуляций в других классах
        new Producer(q);
        new ConsumerPotrebitel(q);

        System.out.println("Dla ostanovki najmite Ctrl-F2.");
    }
}/*
        Dla ostanovki najmite Ctrl-F2.
        Otpravleno: 0
        Polucheno: 0
        Otpravleno: 1
        Polucheno: 1
        Otpravleno: 2
        Polucheno: 2
        Otpravleno: 3
        Polucheno: 3
        ...
*/