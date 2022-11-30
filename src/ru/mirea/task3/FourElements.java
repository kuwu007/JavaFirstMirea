package ru.mirea.task3;
//3-е задание
public class FourElements {
    public static void main(String[] args){
        int[] mas = new int[4];
        for (int i=0; i < mas.length; i++)
            mas[i] = 10 + (int) (Math.random()*90);
        for (int i=0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        boolean flag = true;
        while (flag){
            for (int i = 0; i < mas.length-1; i++){
                if (mas[i] <= mas[i+1]){
                    continue;
                }
                else{
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println("Strictly increasing sequence");
                break;
            }
            else{
                break;
            }
        }
    }
}