package Threads;

class NewThreadMulti implements Runnable {
    String name;// нужно для обращения из цикла for()
    Thread t;
    NewThreadMulti(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New potok: " +t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println(name+ ": " + i);
                Thread.sleep(999);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " prervan");
        }
        System.out.println(name + " zavershen");
    }
}
