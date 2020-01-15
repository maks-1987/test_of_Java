package Threads.Synchronized;

class Synch_1 {
    public static void main(String[] args) {
        CallMe target = new CallMe(); //Создает один экземпл класса CallMe
        Caller ob1 = new Caller(target, "Welcome"); //и три экземпляра
        Caller ob2 = new Caller(target, "to synchronized"); // класса
        Caller ob3 = new Caller(target, "world!"); //Caller
        // Один и тот же экз класса CallMe передается каждому конструктору
        // Caller()
        try { //ожидает завершения
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Prervano");
        }
    }
}/*     [Welcome]
        [to synchronized]
        [world!]
*/