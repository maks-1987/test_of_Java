package Patterns.Creational.AbstractFactory_2;

interface Tank {
    void drive();
}

interface Car {
    void drive();
}
// От него наследуются все фабрики
interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory(
                "Car");
        Factory tankFactory = new AbstractFactory().createFactory(
                "Tank");
        Car toyota = carFactory.createCar("Toyota");
        toyota.drive();
        Tank tank52 = tankFactory.createTank("T52");
        tank52.drive();
    }
}

class T51 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive t51");
    }
}

class T52 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive t52");
    }
}

class TankFactory implements Factory {
    public Tank createTank(String typeOfTank) {
        switch (typeOfTank) {
            case "T51" : return new T51();
            case "T52" : return new T52();
            default : return null;
        }
    }
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default : return null;
        }
    }
    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

// Фабрика, которая производит фабрики
class AbstractFactory {
    Factory createFactory(String typeOfFactory){
       switch (typeOfFactory) {
           case "Car" : return  new CarFactory();
           case "Tank" : return  new TankFactory();
           default: return null;
       }
    }
}
/*
>>>     drive Toyota
        drive t52
*/
