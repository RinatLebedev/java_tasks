package Task4_2;

/*4.2. Реализовать иерархию классов, описывающую трёхмерные фигуры — 3
Реализуйте ту же иерархию классов, но использовав интерфейсы.
Дополнительно, студентам предлагается реализовать интерфейс Comparable.*/


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(3);
        Cylinder cylinder = new Cylinder(5, 3);
        Pyramid pyramid = new Pyramid(100, 2);

        Box box = new Box(400);

        System.out.println(cylinder.getVolume());
        System.out.println(ball.getVolume());

        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));

        //Сортировка списка
        ArrayList<Shape> shapes = box.getShapes();
        Collections.sort(shapes);
    }
}

interface Shape extends Comparable<Shape> {
    double getVolume();

    default int compareTo(Shape s) {
        //Начиная с Java 8 в интерфейсах можно писать реализацию методов, только если метод default
        return Double.compare(getVolume(), s.getVolume());
    }
}

abstract class SolidOfRevolution implements Shape {
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
        return Math.PI * radius * radius * height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius){
        this.radius = radius;
    }

    public double getVolume(){
        return Math.PI*radius*radius*radius*4/3;
    }
}

class Pyramid implements Shape {
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

class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    protected double available;
    private double volume; //Так как в интерфейсе не определена переменная volume, её нужно определить здесь

    public Box(double available) {
        //Обе переменные приравниваем к available, так как доступный материнский класс является интерфейсом и там не
        //определена переменная volume
        this.available = available;
        this.volume = available;
    }

    public boolean add(Shape shape ) {
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
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}


