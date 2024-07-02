package Task4_0;

/*4.0. Реализовать иерархию классов, описывающую трёхмерные фигуры
Класс Box является контейнером, он можем содержать в себе другие фигуры.
Метод add() принимает на вход Shape. Нужно добавлять новые фигуры до тех пор, пока для них хватаем места в Box
(будем считать только объём, игнорируя форму. Допустим, мы переливаем жидкость).
Если места для добавления новой фигуры не хватает, то метод должен вернуть false.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(3);
        Cylinder cylinder = new Cylinder(5, 3);
        Pyramid pyramid = new Pyramid(1, 2, 3);

        Box box = new Box(400);

        System.out.println(cylinder.getVolume());
        System.out.println(ball.getVolume());

        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
    }
}
class Shape {
    private double volume;

    public Shape(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius){
        /*В конструктер передаем 2 параметра
        Так как класс SolidOfRevolution наследуется от класса Shape, при создании объекта класса SolidOfRevolution
        будет использоваться переменная из конструктура класса Shape(volume), значит её нужно добавить в конструктор*/
        super(volume);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
}

class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height){
        /*В конструктор передаем радиус и высоту
        В super мы передаем 2 переменные, которые используются в конструкторе класса SolidOfRevolution: объём и радиус*/
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}


class Ball extends SolidOfRevolution{
    public Ball(double radius){
        super(Math.PI*radius*radius*radius*4/3,radius);

    }
}

class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h, double volume){
        super( 4/3*s*h);
        this.s = s;
        this.h = h;
    }

}

class Box extends Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available; //Переменная счетчик доступного объема, задается при создании объекта класса

    public Box(double available) {
        super(available);
        this.available = available;
    }
    public boolean add(Shape shape ) {
        //При добавлении объекта какой-либо фигуры в список shapes, автоматически рассчитывается остаток объема(available)
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}








