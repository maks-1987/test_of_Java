package Cycles;

import java.util.ArrayList;

class ForEach2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(136);
        list.add(387);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        //for each очень удобный, когда необходимо вывести на экран
        //все элементы массива/коллекции или перезаписать все элементы
        //с одного массива/коллекции в другой.
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(51);
        list2.add(136);
        list2.add(387);

        for (Object i : list2) {
            System.out.println(i);
        }

        // iter
        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }
}/*
>>>     51
        136
        387
*/