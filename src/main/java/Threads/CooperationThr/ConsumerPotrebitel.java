package Threads.CooperationThr;

public class ConsumerPotrebitel implements Runnable {
    Q q; // связались с классом ссылкой q
    // при создании экземпл этого класса запускается поток из конструктора
    ConsumerPotrebitel(Q q) {
        this.q = q;
        new Thread(this, "Potrebitel").start();
    }

    @Override
    public void run() {
        while(true) {
            q.get(); // поток запустился и начал вызывать метод get()
        }
    }
}
