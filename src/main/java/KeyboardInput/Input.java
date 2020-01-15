package KeyboardInput;

import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        //Для ввода с клавы используют System.in, он позволяет считывать
        //только коды символов. Что бы обойти эту проблему используют конструкцию:
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //Читаем строку с клавиатуры
        System.out.println("Введите Слово: ");
        String name1 = bufferedReader.readLine();
        //Читаем следующую строку с клавиатуры
        System.out.println("Введите число: ");
        String sAge1 = bufferedReader.readLine();
        //Преобразуем строку в число
        int nAge1 = Integer.parseInt(sAge1);
    }
    //Более компактная запись первой части:
    public Input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
    }
    //Еще более компактная запись:
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int age = scanner.nextInt();
}//Что бы считать строку с клавы, удобно использовать объектом BufferedReader.
//Но для этого в него нуж. передать объект, из которого он будет вычитывать данные
//это System.in. Но System.in и BufferedReader не совместимы др. с другом
//поэтому используют ПЕРЕХОДНИК - InputStreamReader объект.
