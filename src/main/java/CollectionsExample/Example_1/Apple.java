package CollectionsExample.Example_1;

public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {return id;}

    @Override
    public String toString() { // для лучшего вида вывода в консоль
        return "Apple{" +
                "id=" + id +
                '}';
    }
}
