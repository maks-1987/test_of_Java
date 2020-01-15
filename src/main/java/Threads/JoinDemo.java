package Threads;

class JoinDemo {
    public static void main(String[] args) {
        NewThrJoin ob1 = new NewThrJoin("One");
        NewThrJoin ob2 = new NewThrJoin("Two");
        NewThrJoin ob3 = new NewThrJoin("Three");

        System.out.println("One start: " +ob1.t.isAlive());
        System.out.println("Two start: " +ob2.t.isAlive());
        System.out.println("Three start: " +ob3.t.isAlive());
        //ожидаем завершения потоков
        try { //Даже если будет один поток в блоке кода, main ждет его окончания
            System.out.println("  Waiting...");
            ob1.t.join(); //главн поток будет ждать, пока отработают потоки
            ob2.t.join(); //ob1, ob2 и ob3. Главн поток ждет завершения потока
            ob3.t.join(); //у которого вызван метод join()
        } catch (InterruptedException e) {
            System.out.println("Glav potok prervan");
        }
        System.out.println("One start: " +ob1.t.isAlive());
        System.out.println("Two start: " +ob2.t.isAlive());
        System.out.println("Three start: " +ob3.t.isAlive());

        System.out.println("Glavn potok zaversh");
    }
}/*     New thread: Thread[One,5,main]
        New thread: Thread[Two,5,main]
        New thread: Thread[Three,5,main]
        One start: true
        Two start: true
        Three start: true
        Waiting...
        One: 5
        Three: 5
        Two: 5
        Two: 4
        One: 4
        Three: 4
        One: 3
        Three: 3
        Two: 3
        Three: 2
        One: 2
        Two: 2
        Three: 1
        One: 1
        Two: 1
        Three zaversh
        One zaversh
        Two zaversh
        One start: false
        Two start: false
        Three start: false
        Glavn potok zaversh
*/