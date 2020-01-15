package Threads.LockThr;

/**
 * Создаются 2 класса - A, B с методами foo() и bar(), которые приостанавливаются
 * перед попыткой вызова метода из другого класса. В главном классе получают экземпл
 * этих классов, затем запускается 2-й поток , в котором устанавливается состояние
 * взаимной блокировки.
 * Соперничающий поток владеет монитором объекта b, тогда как он ожидает монитора
 * объекта а. В то же время Главн поток владеет объектом а и ожидает получить объ b
 * Следоват, прога никогда не завершится.
 */
public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("Glavn potok");
        Thread t = new Thread(this, "Sopernichaushij potok");
        t.start();

        a.foo(b); // получить блокировку для объекта а в этом потоке
        System.out.println("Nazad v glavn potok");
    }

    public static void main(String[] args) {
        new DeadLock();
    }

    @Override
    public void run() {
        b.bar(a); // получить блок для объекта b в другом потоке
        System.out.println("Nazad v drugoj potok");
    }
}/*     Glavn potok voshel v metod A.foo()
        Sopernichaushij potok voshel v metod B.bar()
        Glavn potok pitaetsa vizvat metod B.last()
        Sopernichaushij potok pitaetsa vizvat metod A.last()
*/