package KeyboardInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferWhile {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Insert data...");
            String s = br.readLine();
            System.out.println("Input data: " + s+ "\n" +
                    "for exit written 'exit'" + "\n");
            // пока не напишем "exit" программа не закончится
            if (s.equals("exit")) { // || s.equals("Exit") || s.equals("EXIT")) {
                return;
            }
        }
    }
}
