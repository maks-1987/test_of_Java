package Threads;

class NewThrJoin implements Runnable {
    String name;
    Thread t; //необходимо для обращения из класса JoinDemo

    NewThrJoin(String threadName) {
        //String name = threadName; //можно и так, но нельзя буд использовать вызов
        //Thread t = new Thread(this, name); //переменных из др классов и методов
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " +t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println(name+ ": " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name+ " prervan");
        }
        System.out.println(name+ " zaversh");
    }
}
