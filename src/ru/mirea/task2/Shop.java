package ru.mirea.task2;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> computers=new ArrayList<Computer>();
    public Computer findComputer(String name){
        for(Computer c : computers){
            if(c.getName().compareTo(name)==0)
                return c;
        }
        return null;
    }
    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void removeComputer(Computer c){
        computers.remove(c);
    }

    public static void main(String[] args) {
        Shop shop=new Shop();
        System.out.println("Введите три названия компьютеров.");
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        shop.addComputer(new Computer(n1));
        String n2 = scan.nextLine();
        shop.addComputer(new Computer(n2));
        String n3 = scan.nextLine();
        shop.addComputer(new Computer(n3));
        System.out.println("Компьютеры в магазине: "+'\n'+n1+'\n'+n2+'\n'+n3);

        System.out.println("Что хотите найти? ");
        String p1 = scan.nextLine();
        Computer tmp=shop.findComputer(p1);
        if(tmp==null)
            System.out.println("Нет такого компьютера");
        else
            System.out.println("Найдено "+tmp);

        System.out.println("Что хотите удалить? ");
        String p2 = scan.nextLine();
        shop.removeComputer(shop.findComputer(p2));

    }

}