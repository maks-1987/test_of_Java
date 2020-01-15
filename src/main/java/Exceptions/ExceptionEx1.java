package Exceptions;

/**
 * Исключения - это спец механизм для контроля над ошибками в проге. Например:
 * 1 - прога пытается записать файл на заполненный диск; 2 - прога пытается
 * вызвать метов у переменной, которая хранит ссылку - null; 3 - прога пытается
 * разделить число на 0. Когда возникает ошибка, JVM создает спец объект
 * exception - исключение, в который записывается вся инфа об ошибке. Для разных
 * ошибок есть разные исключения. Затем это исключение заставляет прогу тут же
 * выходить из текущей функции, затем выходит из следующей, и так до выхода из
 * метода main. Потом прога заершается. Перехват исключ осуществляет конструкция
 * try - catch.
 */
public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println("Prog starts ");
        try {
            System.out.println("Before method1 calling ");
            method1();
            System.out.println("After method1 calling. Newer will be show");
        } catch (Exception e) {
            System.out.println("Exception has been caught");
        }
        System.out.println("Prog. is still running");
    }
        static void method1() {
            int i = 100;
            int b = 0;
        System.out.println(i/b);
    }
}/*
        Prog starts
        Before method1 calling
        Exception has been caught
        Prog. is still running
*/
