package Generic_Обобщения.Generic_Tkach;

import java.util.List;

/**
 * При создании экземпляров контейнера типа <Т> компилятор ожидает, что
 * этот тип будет наследником класса Product (Phone, Camera) или сам Product
 * Если указали интерфейс, <T> будет либо этим интерфейсом либо тем, кто реализ
 * этот интерф, либо тот кто "приведет" к этому интерф.
 *
 * @param <T>
 */
class Container<T extends Product> {
    T arr;

    public T getArr() {
        return arr;
    }

    public void setArr(T arr) {
        this.arr = arr;
    }

    void add(T o) {
        arr = o;
    }

    public T getItem() {
        return arr;
    }

    public void setItem(T item) {
        this.arr = item;
    }

    boolean isSameProduct = false;

}

/**
 * Product - класс тольо один и только первый в очереди
 * Comparable - интерф можно сколько угодно
 */
class Name<T extends Product & Comparable> {
}
