package AboutClasses;

class BoxDemo_Param {
    public static void main(String args[])  {
        // объявление, резервирование и инициализация объектов Box_Param
        /* значения 10, 20 и 15 передаются конструктору Box() при
        создании объекта с использованием оператора new. Таким образом,
        копии переменных width, height и depth будут содержать
        соответственно значения 10, 20 и 15 */
        Box_Param mybox1 = new Box_Param(10, 20, 15);
        Box_Param mybox2 = new Box_Param(3, 6, 9) ;
        double vol;
    // получение объема первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
    // получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}/*
>>>     Объем равен 3000.0
        Объем равен 162.0
*/