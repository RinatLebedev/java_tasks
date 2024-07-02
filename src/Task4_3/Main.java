package Task4_3;

/*4.3. Реализовать иерархию классов, описывающую трёхмерные фигуры — 4
Задача: Добавьте в иерархию классов фигуру вращения для произвольной функции. Вычислять объём можно приближенное
с помощью определённого интеграла. Так как объём фигуры вращения вокруг оси x это */
import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Ball ball1 = new Ball(3);
        Cylinder cylinder1 = new Cylinder(5, 3);
        Pyramid pyramid1 = new Pyramid(1, 2, 3);

        Box box = new Box(400);

        Shape shape = new RotationFigure(new Function<Double, Double>() {
            @Override
            public Double apply(Double x) {
                return Math.cos(x);
            }
        }, 0, 10);
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

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
    public SolidOfRevolution(double volume){   //перегрузка для фигур, заданных функцией
        super(volume);
    }

    public double getRadius(){
        return radius;
    }
}

class RotationFigure extends SolidOfRevolution {
    private Function<Double,Double> function;
    private double a;
    private double b;

    public RotationFigure(Function<Double, Double> function, double a, double b){
        super(b-a);
        this.function = function;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getVolume() {
        /*
        1) Для n из суммы ряда создаем переменную iterations(выбираем количество итерацию в самой функции)
        2) Счетчик, в который мы будет суммировать значения, согласно методу
        прямоугольников будет - sum (по умолчанию равен 0)
        3) Дельта x будет равна среднему отрезку после деления на количество итераций (delta = (b - a)/iterations)
        4)
        */
        double sum = 0;
        int iterations = 10000;
        double delta = (b - a)/iterations;
        for(int i = 0; i < iterations; i++){
            double x = a + ((b - a) * i/iterations);
            sum += Math.pow(function.apply(x), 2) * delta;
        }
        return Math.PI * sum;
    }
}


class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height){
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius){
        super(Math.PI*radius*radius*radius*4/3,radius);

    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h, double volume){
        super( 4/3*s*h);
        this.s = s;
        this.h = h;
    }

}

class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
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
}

