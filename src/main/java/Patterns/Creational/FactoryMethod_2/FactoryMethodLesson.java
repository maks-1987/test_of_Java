package Patterns.Creational.FactoryMethod_2;

/**
 * Предоставляет интерфейс для создания самого себя. Либо есть метод, который
 * создает "сам себя" не по конструктору, а по статическому методу.
 * Нужен для делегирования (переложить обязательства на...) создания экземпляров
 * другому классу.
*/
public class FactoryMethodLesson {
    public static void main(String[] args) {
        Person person = Person.create();
    }
}

class Person {
    private Person() {} // конструктор приватный, чтобы не могли создать его
                        // по конструктору
    static Person create() {
        return new Person();
    }
}