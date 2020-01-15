package StaticMod;

class StaticClassExample {
    private static int catCount = 0;//Существует в единственном экземпляре, что позволит
                                    //считать созданные объекты при вызове в конструкторе
    public static void main(String[] args) {
        Cat vaska = new Cat("Jaguar");
        Cat murka = new Cat("Tiger");

        System.out.println("catCount: " + catCount);
    }
    static class Cat{
        private String name;
        //Конструктор класса Cat
        Cat(String name){
            this.name = name;//Копия переменной name, будет равна переданной в конструктор
            //Далее вызовем перем. catCount и увеличим ее на единицу каждый раз при обращении
            StaticClassExample.catCount++;//Обращение к статич. переменной
        }
    }
}/*
>>>    catCount: 2
*/