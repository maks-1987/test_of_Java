package Generic_Обобщения.Generic_Tkach;

import java.util.ArrayList;
import java.util.List;

/**
 * При создании экземпляров контейнера типа <Т> компилятор ожидает, что
 * этот тип будет наследником класса Product (Phone, Camera) или сам Product
 * Если указали интерфейс, <T> будет либо этим интерфейсом либо тем, кто реализ
 * этот интерф, либо тот кто "приведет" к этому интерф.
 *
 * @param <T>
 */
public class Container<T extends Product> {
    List<T> arr = new ArrayList<T>();

    public List<T> getArr() {
        return arr;
    }

    public void setArr(T arr) {
        this.arr = (List<T>) arr;
    }

    void add(T o) {
        arr = (List<T>) o;
    }

    public T getItem() {
        return (T) arr;
    }

    public void setItem(T item) {
        this.arr = (List<T>) item;
    }

    boolean isSameProduct = false;

}

/**
 * Product - класс тольо один и только первый в очереди
 * Comparable - интерф можно сколько угодно
 */
class Name<T extends Product & Comparable> {
}
