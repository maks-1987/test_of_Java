package Threads.Synchronized;

class CallMe {
    void call(String msg) { //принимает строку
        System.out.print("[" +msg); //выводит '[' и 'строку', потом
        try {                         //спит 1 сек
            Thread.sleep(1000); //приостанавл текущ поток исполнения
        } catch (InterruptedException e) {
            System.out.println("Prervano");
        }
        System.out.println("]"); //после сна дописывает ']'
    }
}
