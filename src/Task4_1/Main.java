package Task4_1;

/* 4.1. Реализовать иерархию классов, описывающую трёхмерные фигуры — 2
Реализуйте ту же иерархию классов, но сделав некоторые классы абстрактными.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(3);
        Cylinder cylinder = new Cylinder(5, 3);
        Pyramid pyramid = new Pyramid(100,3);

        Box box = new Box(400);

        System.out.println(cylinder.getVolume());
        System.out.println(ball.getVolume());
        System.out.println(pyramid.getVolume());

        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
    }
}

abstract class Shape{
    /*Так как класс абстрактный, в конструкторе нет необходимости
    Переменная volume объявлена как protected, чтобы классы наследники могли обращаться к этой переменной напрямую, а
    не через конструктор материнского класса */

    protected double volume;
    public double getVolume(){
        return volume;
    }
}

abstract class SolidOfRevolution extends Shape {
    protected double radius;

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double getVolume(){
        //Реализуем родительский метод, созданный, но не реализованный в материнском абстрактном классе Shape
        return Math.PI * radius * radius * height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius){
        this.radius = radius;
    }
    public double getVolume(){
        //Реализуем родительский метод, созданный, но не реализованный в материнском абстрактном классе Shape
        return Math.PI*radius*radius*radius*4/3;
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h){
        this.s = s;
        this.h = h;
    }

    public double getVolume(){
        return 4/3*s*h;
    }
}

class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box(double available) {

        this.available = available;
        this.volume = volume;
    }
    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
    public double getVolume() {
        return volume;
    }
}