public class HomeWorkJava1 {

    public static void main (String args []) {

        /* 1.Проверить и вывести на экран, является ли целое число
        записанное в переменную n, чётным либо нечётным.*/
        /* int n = 32;
        if (n%2 == 0) {System.out.println("n " + "четное число");}
        else {System.out.println("n " + "нечетное число");} */

        /*2. Вывести на экран ближайшее к 10 из двух чисел, записанных
        в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
        /* double m = 8.5;
        double n = 11.5;
        double a = 10;
        double dis1 = a - m;
        double dis2 = a - n;
        if (dis1 > dis2) {System.out.println("число "+n+" ближе к числу "+a);}
        else {System.out.println("число "+m+" ближе к числу "+a);}*/

        /*3. Вывести на экран случайно сгенерированное трёхзначное
        натуральное число и его наибольшую цифру.*/
        int n = 100 + (int)(Math.random()*899);
        int a,b,c;
        a = n/100;
        b = (n%100)/10;
        c = n%10;
        if(a>=b&&a>=c) {System.out.println("В числе "+n+" наибольшая цифра "+a);}
        else if(b>=a&&b>=c) {System.out.println("В числе "+n+" наибольшая цифра "+b);}
        else {System.out.println("В числе "+n+" наибольшая цифра "+c); }

    }
}
