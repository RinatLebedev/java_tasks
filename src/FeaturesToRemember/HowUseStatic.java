package FeaturesToRemember;

// Ключевое слово (атрибут) static при объявлении поля класса говорит о том, что значение этого поля для всех будущих
// созданных экземпляров этого класса будет одинаковым.

public class HowUseStatic{
    public static void main(String[] args) {
        Human human1 = new Human("Коля", 20);
        Human.nationality = "Русский";
        human1.getAllFields();
        Human.getNationality(); //Статичесские  переменные не могут работать с переменными объекта
    }
}
class Human{
    private String name;
    private int age;
    public static String nationality; // так как это статик, значит его значение будет одинаковым для всех экземпляров класса

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void getAllFields(){
        System.out.println(name+", " + age+", "+ nationality);
    }
    //Статические методы могут использовать только статические переменные
    public static void getNationality(){
        System.out.println("Национальность: " + nationality);
    }
}

