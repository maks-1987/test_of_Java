package AboutClasses;

class StackTest {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        // заталкивает числа в стек
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // выталкивает эти числа из  стека
        System.out.println("Стек в mystackl:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}/*
>>>     Стек в mystack1:
        9
        8
        7
        6
        5
        4
        3
        2
        1
        0
        Стек в mystack2:
        19
        18
        17
        16
        15
        14
        13
        12
        11
        10
*/
