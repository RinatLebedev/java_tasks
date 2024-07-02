package Task6_0_1;

import java.util.Scanner;

/*Конвертер температур
Задача:
Напишите класс BaseConverter для конвертации из градусов по Цельсию в
Кельвины, Фаренгейты, и так далее. У класса должен быть метод convert, который и делает конвертацию.*/
public class Main {
    public static void main(String[] args) {

        //Должно быть не так, это для теста
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int size1 = scanner1.nextInt();
        System.out.println("Введите единицу измерения: ");
        String size2 = scanner2.nextLine();

        BaseConverter baseConverter = new BaseConverter();
        baseConverter.convert(size1,size2);

    }
}
