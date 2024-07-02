package FeaturesToRemember.PolymorphismTest;

import FeaturesToRemember.PolymorphismTest.Animal;
import FeaturesToRemember.PolymorphismTest.Dog;

public class Castings {
    public static void main(String[] args) {
        //Восходящее и нисходящее преобразования
        Dog dog = new Dog();

        //Upcasting - восходящее преобразование
        Animal animal = new Dog();   /*Это равносильно:
                                     Dog dog1 = new Dog();
                                     Animal animal1 = dog1;*/


        //Downcasting - нисходящее преобразование
        Animal animal1 = new Dog();
        Dog dog1 = (Dog) animal1;  //это и есть нисходящее преобразование, но оно не всегда безопасно, так как animal1(ссылка)
        //может и не ссылаться на объект класса Dog
        dog1.bark();
    }
}
