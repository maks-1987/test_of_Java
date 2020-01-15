package ScopeVariable;

public class Counter {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count = Cat.count + 1;
        Cat cat2 = new Cat();
        Cat.count = Cat.count + 1;
        //cat1.count = Cat.count + 1;
        //cat2.count = Cat.count + 1;

        System.out.println("Cats count is " + Cat.count);
    }
    private static class Cat {
        private static int count = 0;
    }
}
// >>> Cats count is 2
