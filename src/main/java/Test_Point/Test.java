package Test_Point;

//import com.sun.org.apache.xpath.internal.SourceTree;

class Point {
    int x, y;
    int getX() {
        return x;//simple (простое) name
    }
}
class Test {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 3;
        System.out.println(p.x);
        System.out.println(p.hashCode());
    }
}

