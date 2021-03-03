public class HomeWorkJava2 {
    public static void main (String args []) {
/* 1. Создать двумерный массив из 5 строк по 8 столбцов в
каждой из случайных целых чисел из отрезка [-99;99].
Вывести массив на экран. После на отдельной строке вывести на экран
значение максимального элемента этого массива (его индекс не имеет значения).*/

        int[][] array = new int[5][8];
        int max = 0;
        System.out.println("К вашему вниманию массив из случайных целых чисел из отрезка [-99;99]");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++) {
                array[i][j] = -99 + (int)(Math.random()*198);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальный елемент в массиве "+max);

    }
}
