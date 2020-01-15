/**
 * В цикле foreach переменной с будет поочередно присваиваться
 * значение за знаком двоеточия
 */
class ForEachString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c + " ");

        System.out.println();
        int i=0;
        while (true) {
            i++;
            int j = i*27;
            if (j==1269) break; // разрешит сосчитать до 47 (1296/27)
            if (i%10 !=0) continue; // на значении i=10 пойдет печатать
                                    // и вернется к началу цикла
            System.out.print(i+ " ");
        }
    }
}/*
    A n   A f r i c a n   S w a l l o w
    10 20 30 40
*/
