package ru.mirea.task1;
import java.util.Scanner;
/*
Разработайте программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда
(форматируйте вывод).
 */
public class HarmonicSeries {
    public static void main(String[] args)
    {
        int[] myArray;
        myArray = new int[10];

        for (int i=0;i<10;i++)
        {
            System.out.print(String.format("%.3f,  ",1.0/i));
        }
    }
}
