package FeaturesToRemember.Generics.Wildcards;

public class Animal {
    private int id;

    //Пустой конструктор позволяет не писать конструктор в классе Dog
    public Animal(){

    }

    //Если бы был только этот констуктор, то в классе Dog пришлось бы написать конструктор
    public Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public String toString(){
        return String.valueOf(id); //Приведение из int в String
    }
}
