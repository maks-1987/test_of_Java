package Patterns.Facade;

class FacadeApp {
    public static void main(String[] args) {
        /**
         Power power = new Power();
        power.on();

        DVDRom dvd = new DVDRom();
        dvd.load();

        HDD hdd = new HDD();
        hdd.copyFromDVDRom(dvd);

         * можно не писать код выше, если создать класс - фасад Computer
        */
        Computer computer = new Computer();
        computer.copy();
    }
}
class Computer { /** это класс - фасад */
    private Power power = new Power();
    private DVDRom dvd = new DVDRom();
    private HDD hdd = new HDD();

    void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVDRom(dvd);
    }
}
class Power {
    void on() {
        System.out.println("Включение ПК");
    }
    void off() {
        System.out.println("Выключение питания ПК");
    }
}
class DVDRom {
    private boolean data = false;
    boolean hasData() {
        return data;
    }
    void load() {
        data = true;
    }
    void unload() {
        data = false;
    }
}
class HDD {
    void copyFromDVDRom(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Происходит копирование...");
        } else {
            System.out.println("Вставьте диск...");
        }
    }
}/*
    Включение ПК
    Происходит копирование...
*/