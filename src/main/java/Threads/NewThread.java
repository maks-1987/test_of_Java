package Threads;

//созд второй поток
class NewThread implements Runnable {
    NewThread() {
        //созд новый, второй поток
        Thread t = new Thread(this, "Демо поток");
        t.start(); //запустить поток
    }
    //Точка входа во второй поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен.");
    }
}
