package Threads.CooperationThr;

public class Producer implements Runnable {
    Q q; // связались с классом ссылкой q
    // при создании экземпл этого класса запускается поток из конструктора
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Postavchik").start();
    }

    @Override
    public void run() {
        int i = 0;
        while(i<5) { // чтобы не был бесконечным
            q.put(i++); // поток запустился и начал вызывать метод put()
        }
    }
}
