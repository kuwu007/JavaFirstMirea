package ru.mirea.task3;

public class RandomMassive {
    public static void main(String[] args){
        int[] mas = new int[10];
        int x = 0;
        for (int i=0; i < 10; i++)
            mas[i] = (int) (Math.random()*100);
        for (int i=0; i < 10; i++)
            System.out.print(mas[i] + " ");
        System.out.println("Sorted:");
        boolean I = true;
        while (I) {
            I = false;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    x = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = x;
                    I = true;
                }
            }
        }
        for (int i=0; i < 10; i++)
            System.out.print(mas[i] + " ");
    }
}
