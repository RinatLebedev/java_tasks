package FeaturesToRemember.PolymorphismTest;

public class Main {
    public static void main(String[] args) {

        //1
        System.out.println("//1");
        // Обычное создание объектов классов
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();

        animal1.eat(); //Вызов метода выводит: "Animal is eating"
        dog1.eat(); //Вызов метода выводит: "Animal is eating"

        //2
        System.out.println("//2");
        //Создание объекта класса Dog через переменную типа Animal
        Animal animal2 = new Dog();
        Dog dog2 = new Dog();


        animal2.eat(); //-Работает. Вызов метода выводит: "Animal is eating"
        /*
        animal2.bark();
        Не работает. Мы не имеем в переменной типа Animal доступ к методам класса Dog,
        даже несмотря на то что Animal это родительский класс.
        В animal2 мы рассматриваем собаку как животное, в dog2 мы рассматриваем собаку как собаку*/

        //3
        System.out.println("//3");
        // Теперь переопределим метод eat в классе Dog
        Animal animal3 = new Dog();

        animal3.eat(); //Вызов метода выводит: "Dog is eating". Позднее связывание - если в потомке есть реализация нужного метода
        //то будет вызвана она, если реализации в потомке нет, будет вызвана реализация из родительского класса


        //4
        System.out.println("//4");
        Animal animal4 = new Animal();
        Dog dog4 = new Dog();
        Cat cat4 = new Cat();

        test(animal4);
        test(dog4);
        test(cat4);
        //Полиморфизм позволяет сократить код. Мы можем вызвать метод test, как для класса родителя, так и для классов наследников
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
