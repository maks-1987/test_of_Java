package Threads;

class CurrentThrDemo {
    public static void main(String[] args) {
        //получение ссылки 't' на поток из которого был вызов программы
        Thread t = Thread.currentThread();
        System.out.println("Tekushij potok: " +t);//инфо о текущ потоке

        //получить имя текущ потока
        String name = t.getName();
        System.out.println(name);

        //изменить имя потока исполнения
        t.setName("My Thr");
        System.out.println("Posle izmenenija: " +t);

        try {
            for (int n = 10; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);

                if (n<8) t.interrupt(); //прервем поток на вызове <8
            }
        }catch (InterruptedException e) {
            System.out.println("Glav potok prervan");
        }
    }
}/*
        Tekushij potok: Thread[main,5,main]
        Posle izmenenija: Thread[My Thr,5,main]
        10
        9
        8
        7
        6
        Glav potok prervan
        */
