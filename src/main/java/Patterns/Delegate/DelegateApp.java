package Patterns.Delegate;

interface Graphics {
    void draw();
}
class DelegateApp {
    public static void main(String[] args) {
       Painter painter = new Painter();
       painter.setGraphics(new Circle());
       painter.draw();

       painter.setGraphics(new Square());
       painter.draw();
    }
}
class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Triangle...");
    }
}
class Square implements Graphics {
    @Override
    public void draw() {
        System.out.println("Square...");
    }
}
class Circle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Circle...");
    }
}
/**
 * Класс не будет сам реализ все три метода, а будет возлагать эти обязанности
 * на другие классы, используя их готовую реализацию методов
 */
class Painter {
    private Graphics graphics;
    // метод - мутатор, который в качестве аргум получ конкретный экземпляр
    // интерфейса и присваивает атрибуту ссылку на него
    void setGraphics(Graphics g) {
        graphics = g;
    }
    void draw() {
        graphics.draw();
    }
}/*
        Circle...
        Square...
*/

