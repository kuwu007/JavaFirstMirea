package ru.mirea.task2;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author author= new Author("Екатерина", "yshtender@mail.ru", 'ж');
        System.out.println("Информация о пользователе.");
        System.out.println(author.toString());
        System.out.println('\n');


        System.out.print("Введите новую почту: ");
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        author.setEmail(n);

        System.out.println("Обновленная информация о пользователе.");
        System.out.println(author.toString());

    }
}
