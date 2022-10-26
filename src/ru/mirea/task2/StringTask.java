package ru.mirea.task2;

public class StringTask {
    public static void main(String[] args){
        String[] text = {" Hello ", " from ", " world "};
        int n = text.length;
        String temp;

        for (int i=0;i<n/2;i++){
            temp = text[n-i-1];
            text[n-i-1] = text[i];
            text[i] = temp;
        }

        for (int i=0; i<n;i++)
            System.out.print(text[i]);
    }
}
