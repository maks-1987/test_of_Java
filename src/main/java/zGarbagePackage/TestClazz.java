package zGarbagePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestClazz  {
    // происходит копирование файлов из data в result, посимвольно (123qwe)
    public static void main(String[] args) throws java.io.IOException {
        // Сравнение ссылок
        String name = new String("Vasia");
        String name2 = new String("Petia");
        String s = new String("Mama");
        String s2 = new String("Mama");
        TestClazz testClazz = new TestClazz();
        TestClazz testClazz2 = new TestClazz();

        boolean nameTest = name == name2;
        System.out.println("name == name2 " + nameTest);
        System.out.println("name.equals(name2) " + name.equals(name2));

        boolean sTest = s == s2;
        System.out.println("s == s2 " + sTest);
        System.out.println("s.equals(s2) " + s.equals(s2));

        boolean testCLAZZ = testClazz == testClazz2;
        System.out.println("testClazz == testClazz2 " + testCLAZZ);
        System.out.println("testClazz.equals(testClazz2) " + testClazz.equals(testClazz2));


        FileInputStream fileInputStream = new FileInputStream("d:\\data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            System.out.println("Uhaha");
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    class ClassVariable {
        public int count = 0;

        public void run() {
            count = 15;
            int count = 10;
            count++;
            this.count=12;
        }


    }
}



