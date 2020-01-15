package Lambda;

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // ссылка на функциональн интерфейс
        // когда выражение присваивается ссылочной переменной myName, получится
        // экземпляр класса, в котором лямб-выраж реализует метод getValue() из
        // функционального интерф MyNumber
        myNum = () -> 123.45;

        System.out.println("Fixed value: " +myNum.getValue());

        myNum = () -> Math.random()*100;

        System.out.println("Random value: " +myNum.getValue());
        System.out.println("One more random val: " +myNum.getValue());

        // Лямбда-выраж долж быть совместимо с абстракт методом, в функц интерф
        //myNum = () -> "123.45"; // ERROR
    }
}/*
        Fixed value: 123.45
        Random value: 5.129615627928608
        One more random val: 4.067689246873362
        */
