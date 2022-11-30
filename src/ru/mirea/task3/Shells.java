package ru.mirea.task3;
//Класс оболочки, первое задание
public class Shells {
    public static void main(String[] args) {
        Double a = Double.valueOf(5);
        Double b = Double.valueOf("55");
        System.out.println("1) "+ a + "\n" +b);
        double c = Double.parseDouble("10");
        System.out.println("2) " + c);
        Double d = 4.0;
        d = Double.parseDouble(String.valueOf(d));
        System.out.println("3) " +d);
        double e;
        String s = Double.toString(3.14);
        e = Double.parseDouble(s);
        System.out.println("4) "+ e);
    }
}