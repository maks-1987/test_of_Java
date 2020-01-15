package SoloLearn.CheckOuts;

import java.util.TreeSet;

class CheckOut_1 {

    public static void main(String[] args) {
        A x = new A();
        A y = new A(x);

        System.out.println(rec(15, 9));

        TreeSet set = new TreeSet(); //set:size=0; set:size=1; set:size=2; set:size=3;
        set.add(1); // set:size=0;
        set.add(9); // set:size=1;
        set.add(9); // set:size=2;
        set.add(6); // set:size=2;

        for(Object o:set) { // set:size=3; o:1 set:size=3; o:6 set:size=3; o:9 set:size=3;
            System.out.println("\t" + o); // o:1; o:6; o:9
        }
    }

    static int rec(int m, int n) {
        if (m % n == 0) { // m=15, n=9; m=9, n=6; m=6, n=3;
            return n; // 6%3==0 - true, n=3;
        } else {
            // recursive method()
            return rec(n, m % n); // n=9, m=15; n=6, m=9;
        }
    }



}/*
      	   ba
  	   3
  	        1
	        6
	        9
*/
