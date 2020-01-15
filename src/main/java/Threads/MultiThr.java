package Threads;

class MultiThr {
    public static void main(String[] args) {
        new NewThreadMulti("One");
        new NewThreadMulti("Two");
        new NewThreadMulti("Three");

        try {
            // ожидание завершения других потоков
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Glavn potok prervan");
        }
        System.out.println("glavn potok zaversh");
    }
}/*     New potok: Thread[One,5,main]
        New potok: Thread[Two,5,main]
        New potok: Thread[Three,5,main]
        One: 5
        Two: 5
        Three: 5
        Three: 4
        Two: 4
        One: 4
        Three: 3
        One: 3
        Two: 3
        Three: 2
        One: 2
        Two: 2
        One: 1
        Three: 1
        Two: 1
        Two zavershen
        One zavershen
        Three zavershen
        glavn potok zaversh
*/