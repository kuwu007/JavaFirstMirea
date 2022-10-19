package ru.mirea.task2;

public class Circle {
    private Point o;

    public void addPoint(double x, double y){
        Point point = new Point(x,y);
    }

    public Circle(double x, double y) {
        Point a1 = new Point(x,y);
    }
    private int r;
    private final double PI = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getLength() {
        return 2*PI*r;
    }

    public double getSquare() {
        return PI*r*r;
    }

    public void compare(Circle obj) {
        if (obj.r > this.r)
            System.out.println("Второй круг больше");
        else if (obj.r == this.r)
            System.out.println("Равны");
        else
            System.out.println("Первый круг больше");
    }
}