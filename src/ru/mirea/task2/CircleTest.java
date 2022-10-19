package ru.mirea.task2;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj1 = new Circle(8);
        System.out.println("Радиус первого круга: "+ obj1.getR());
        System.out.println("Длина окружности: " + obj1.getLength());
        System.out.println("Площадь окружности: " + obj1.getSquare());
        Circle obj2 = new Circle(5);
        Circle obj3 = new Circle(10);
        System.out.println("Сравним "+obj1.getR()+" и "+obj2.getR());
        obj1.compare(obj2);
        System.out.println("Сравним "+obj1.getR()+" и "+obj3.getR());
        obj1.compare(obj3);
    }
}
