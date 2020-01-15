package Threads;

//создание нового потока
class NewThreadExt extends Thread {
    NewThreadExt() {
        //создание нового потока
        super("Demo potok");//super-вызывает конструк Thread(), где
                                //параметр имя_потока обозначает имя порож-
                                //даемого потока: public Thread(String имя_потока)
        System.out.println("Dochern potok: " + this);
        start();
    }
    //точка входа во 2-й поток
    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Dochern potok: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Dochern potok prerv");
        }
        System.out.println("Dochern potok zaversh");
    }
}
