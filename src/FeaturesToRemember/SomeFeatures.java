package FeaturesToRemember;

import java.util.Scanner;

public class SomeFeatures {
    public static void main(String[] args) {


        // 1) Приведение примитивных типов данных

        // Типы данных float и long определяется по умолчанию таким образом (неявное приведение типов)
        float x1 = 7.5F; //если не указать F, то справа будет число double
        long x2 = 88765L; //если не указать L, то справа будет число int

        //Если мы хоти наоборот long привести к int, нам нужно(явное приведение типов):
        int x3 = (int)x2;

        //byte хранит в себе числа от -128 до 127, но если передать 128 или 129 или..
        byte x4 = (byte)128;
        byte x5 = (byte)129;
        byte x6 = (byte)256;
        byte x7 = (byte)512;
        System.out.println(x4); //-128
        System.out.println(x5); //-127
        System.out.println(x6); //0
        System.out.println(x7); //0


        // 2) Классы-обертки примитивных типов данных

        /*Double, Float, Long, Integer, Short, Byte, Character и Boolean

        Они могут быть нужны, например, чтобы вставлять их в Джинерики в коллекциях
        ArrayList<Integer> list = new ArrayList<>();*/

        //Integer y1 = new Integer(123); не совсем верная реализация. В новых версиях:
        Integer y1 = 123;
        Integer.parseInt("123"); //Приведение из строки к Integer

        /* 3) Ввод из консоли реализуется таким способом
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int size1 = s.nextInt();
        System.out.println("Вы ввели число " + size1);
        */

    }
}
