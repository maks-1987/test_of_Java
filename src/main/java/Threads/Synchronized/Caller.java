package Threads.Synchronized;

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;
    //конструктор принимает ссылку на экземпляры классов CallMe & String
    Caller(CallMe targ, String s) { //и сохраняет их в своих переменных
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    //синхронизированные вызовы метода call()
    @Override
    public void run() { //тут вызывается метод call() из класса CallMe
        synchronized(target) { //для экземпляра target, передавая классу
            target.call(msg); //символьную строку msg
        }
    }
}
