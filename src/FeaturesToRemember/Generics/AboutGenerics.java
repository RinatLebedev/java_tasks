package FeaturesToRemember.Generics;


import java.util.ArrayList;
import java.util.List;

public class AboutGenerics {
    public static void main(String[] args) {
        ////////// Java 5 ///////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog"); //1
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        ///////// С появлением дженериков ////////
        List <String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(ourAnimal); Выведет ошибку

        String animal2 = animals2.get(1);

        ///////// Java 7 /////////////
        List <String> animals3 = new ArrayList<>(); //В правой части не обязательно указывать дженерик
    }
}

class Animal{

}
