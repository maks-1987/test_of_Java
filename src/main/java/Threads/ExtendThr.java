package Threads;

class ExtendThr {
    public static void main(String[] args) {
        new NewThreadExt(); // созд нов поток
        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Glavn potok: " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Glavn potok prervan");
        }
        System.out.println("Glavn potok zaversh");
    }
}/*
        Dochern potok: Thread[Demo potok,5,main]
        Glavn potok: 5
        Dochern potok: 5
        Dochern potok: 4
        Glavn potok: 4
        Dochern potok: 3
        Dochern potok: 2
        Glavn potok: 3
        Dochern potok: 1
        Dochern potok zaversh
        Glavn potok: 2
        Glavn potok: 1
        Glavn potok zaversh
*/
