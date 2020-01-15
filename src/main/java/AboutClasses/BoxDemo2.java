package AboutClasses;
/**
 * Инициализация всех переменных класса при каждом создании
 * его экземпляра трата времени. Поскольку необходимость
 * инициализации возникает столь часто, язык Java позволяет
 * объектам выполнять собственную инициализацию при их создании.
 * Эта автоматическая инициализация осуществляется с помощью
 * конструктора. Конструкторы выглядят несколько непривычно, поскольку
 * не имеют типа возвращаемого значения, даже типа void. Это обусловлено
 * тем, что неявно заданным возвращаемым типом конструктора класса
 * является тип самого класса. Именно конструктор инициализирует
 * внутреннее состояние объекта так, чтобы код, создающий экземпляр,
 * с самого начала содержал полностью инициализированный, пригодный к
 * использованию объект.
 */
class BoxDemo2 {
    public static void main(String args[])  {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
        // инициализация каждого экземпляра Box
        myboxl.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        // получение объема первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем равен " + vol);
        // получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }

}
