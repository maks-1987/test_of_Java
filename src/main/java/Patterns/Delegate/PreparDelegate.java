package Patterns.Delegate;

class PreparDelegate {
    public static void main(String[] args) {
        A a = new A();
        a.f();
        B b = new B();
        b.f();
    }
}

class A {
    void f() {
        System.out.println("Я f()" + " из класса А");
    }
}
/**
 * класс B также должен выполнять функцию класса A (такую же)
 * класс B делегирует выполнение задачи другому классу
 */
class B {
    A a = new A();
    // метод вызывает функцию, которая уже реализована в др классе
    void f() {
        a.f();
        //System.out.println("Я из функции f() класса B");
    }
}/*
    Я f() из класса А
    Я f() из класса А
*/
