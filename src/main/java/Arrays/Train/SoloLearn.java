package Arrays.Train;

public class SoloLearn {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x -= 10;
            for (int j = 0; j < 3; j++) {
                x += 10;
            }
        }
        System.out.println(x);
    }
}
