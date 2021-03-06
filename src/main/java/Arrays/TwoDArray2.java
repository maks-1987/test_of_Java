package Arrays;

/**
 * Использование неоднородных (или нерегулярных) массивов может быть не
 * применимо во многих приложениях, поскольку их поведение отличается от
 * обычного поведения многомерных массивов. Нерегулярный массив может
 * быть идеальным решением, если требуется очень большой двухмерный
 * разреженный массив (т.е. массив, в котором будут использоваться не
 * все элементы). Многомерные массивы можно инициализировать. Для этого
 * достаточно заключить инициализатор каждого измерения в отдельный
 * набор фигурных скобок. Внутри инициализаторов массивов можно применять
 * как литеральное значение, так и выражения.
 * При резервиров памяти под многомерные массивы нужно указать память только
 * для первого (левого) измерения.
 */
// Резервирование памяти вручную для массива с различными
// размерами второго измерения
class TwoDArray2 {
    public static void main(String args[]) {
        // присвоили переменной значен массива 4 на 3 индекса
        int twoD[][] = new int[4][3];//или int twoD[][]=new int[4][];
        twoD[0] = new int[1];//это резервирование памяти для второго
        twoD[1] = new int[2];//измерения вручную
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;
        for(i=0; i<4; i++)
            for(j=0; j<i+1; j++) {
                twoD[i][j] = k;
                k++;
        }
        for(i=0; i<4; i++) {
            for(j=0; j<i+1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}/*
>>>     0
        1 2
        3 4 5
        6 7 8 9
*/