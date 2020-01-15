package Threads.CooperationThr;

// Правильная реализация поставщика и потребителя
class Q {
    int n;
    boolean valueSet = false;
    // в методе приостанавливается исполнение
    synchronized int get() {
        while(!valueSet)
            try{
            wait(); // ждет, пока объект класса Producer не уведомит, что
                    // данные прочитаны
            } catch(InterruptedException e) {
                System.out.println("Iskluchenie tipa InterExc perehvach");
            }
        System.out.println("Polucheno: " +n);
        valueSet = false;
        // объект класса Prod уведомляет о получении данных
        notify(); // после получения данных вызовется этот метод
        return n;
    }
    synchronized void put(int n) {
        while(valueSet)
            try{
                wait(); // приостанавливает исполнение потока, пока объект
                        // класса ConsumerPotr не извлечет элемент из очереди
            } catch(InterruptedException e) {
                System.out.println("Iskluchenie tipa InterExc perehvach");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Otpravleno: " +n);
        notify();
    }
}
