package KeyboardInput;

import java.util.Scanner;
//Метод nextLine() считывает целую последоват. символов в строке
//Сохранять ее можно в String объекте
public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        System.out.println(s1 + " & " +  s2);
    }
}
