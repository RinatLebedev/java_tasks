package FeaturesToRemember;

interface AbleToEat{
    public void eat();
}
public class AnonymousClassTest {
    public static void main(String[] args) {
        /*    Анонимные классы
        В интерфейсе мы не можем написать реализацию метода eat(), поэтому нужно создать новый класс, который будет
        имплементировать интерфейс AbleToEat и там реализовать метод eat(), но можно создать анонимный класс внутри
        главного класса, который позволит сократить код, в случае, если использовать метод нам нужно не часто
         */
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
        /* Анонимные классы - это один из типов Вложенных Классов (nested classes).
                    Типы вложенных классов:
             1) Анонимные классы (Anonymous Classes)
             2) Внутренние классы (Inner Classes)
             3) Локальные классы (Local Classes)
             4) Статические вложенные классы (Static nested Classes)*/
    }
}
