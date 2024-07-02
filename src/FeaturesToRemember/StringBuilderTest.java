package FeaturesToRemember;




// Обычные строки - это unmutable объекты, а объекты StringBuilder - mutable(изменяемые)
public class StringBuilderTest {
    public static void main(String[] args) {
        System.out.println("String Builder: ");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());


        // Почему Строки - неизменяемые?
        System.out.println("About strings: ");
        String n = "hello";
        System.out.println(n.toUpperCase());
        System.out.println(n);

        // Форматирование строк
        System.out.println("Strings Formatting: ");
        System.out.printf("Something and %s \n", "something");
        System.out.printf("Something and %d \n", 10);
        System.out.printf("Something and %f \n", 10.8);
        System.out.printf("Something and %-10s \n", 200000);
        System.out.printf("Something and %-10s \n", 200);
        System.out.printf("Something and %10s \n", 30000000);
        System.out.printf("Something and %10s \n", 300);
    }
}

