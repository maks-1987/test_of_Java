package Serialisat;

import java.io.*;

public class SerializatDemo {
    public static void main(String[] args) {
        // произвести сериализац объекта
        try (ObjectOutputStream objOStrm =
                     new ObjectOutputStream(new FileOutputStream("serial")))
        {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        }
        catch (IOException e) {
            System.out.println("Except on serializ: " + e);
        }
        // произвести десериализацию
        try (ObjectInputStream objIStrm =
                     new ObjectInputStream(new FileInputStream("serial")))
        {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        }
        catch (IOException e) {
            System.out.println("Except on deserializ: " + e);
            System.exit(0);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
        object1: s='Hello, i=-7, d=2.7E10
        object2: s='Hello, i=-7, d=2.7E10
*/