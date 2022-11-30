package ru.mirea.task3;
//4-е задание
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = in.nextInt();
        while (num <= 0) {
            System.out.println("Wrong number! Enter another number: ");
            num = in.nextInt();
        }
        int[] mas = new int[num];
        int[] even = new int[num];
        for (int i = 0; i < num; i++) {
            mas[i] = (int) (Math.random()*100);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        int count = 0;
        for (int i = 0; i < num; i++){
            if (mas[i] % 2 == 0){
                even[count] = mas[i];
                System.out.print(even[count] + " ");
                count++;
            }
        }
    }
}