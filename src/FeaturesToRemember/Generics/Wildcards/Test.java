package FeaturesToRemember.Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

        /* Иерархия наследования
        Object
           Animal
              Dog
         */
    }

    private static void test(List<? extends Animal> list){
        for(Animal animal : list){
            animal.eat();
        }
    }
    /*
    1) Если написать generic <?>, то содержимое класса List будет рассматриваться как массив объектов
    2) Если написать generic <? extends Animal>, мы даем понять, что мы хотим поставлять листы класса Animal, либо
    любого другого класса, который наследуется от Animal
    3) Если написать generic <? super Animal>, мы даем понять, что мы хотим поставлять листы класса Animal, либо
    любого другого класса, который выше по иерархии, чем Animal. В этом случае мы не будет иметь доступы к методам
    класса Animal, а будет иметь доступы только к методам класса Object
     */
}
