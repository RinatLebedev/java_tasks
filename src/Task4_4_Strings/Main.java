package Task4_4_Strings;

/*Напишите метод для поиска самой длинной строки в массиве.
          Напишите метод, который проверяет является ли слово палиндромом.
          Напишите метод, заменяющий в тексте все вхождения слова "мат" на «...».
          Имеются две строки. Напишите метод, возвращающий количество вхождений одной строки в другую.*/

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //1)
        String stringArray [] = new String[5];
        stringArray[0] = "Hello";
        stringArray[1] = "HelloWorld";
        stringArray[2] = "Hello World!";
        stringArray[3] = "Good Bye";
        stringArray[4] = "I am String";
        System.out.println("1) Самая длинная строка в массиве: " + findTheLargestString(stringArray));

        //2)
        String s1 = "папап";
        String s2 = "попап";
        String s3 = "Папап";
        System.out.println("2) Слово "+ s1 +" палиндром? Ответ: " + palindromeCheck(s1));
        System.out.println(" Слово "+ s2 +" палиндром? Ответ: " + palindromeCheck(s2));
        System.out.println(" Слово "+ s3 +" палиндром? Ответ: " + palindromeCheck(s3));

        //3)
        String m1 = "матгдемат";
        System.out.println("3) Слово до: " + m1 + "\n Слово после: " + stringReplace(m1));

        //4)
        String g1 = "ДоммоддОм";
        String g2 = "дом";
        System.out.println("4) Количество вхождений строки '" + g2 + "' в строку '" + g1 + "' равно: " + numberOfOccurrences(g1,g2));


    }
    public static String findTheLargestString(String [] strings){
        String largestString ="";
        for(int i = 0; i < strings.length; i++){
            if(strings[i].length()>largestString.length()){
                largestString = strings[i];
            } else{
                continue;
            }
        }
        return largestString;
    }
    public static boolean palindromeCheck(String string){
        boolean b = true;
        String string1 = string.toLowerCase(Locale.ROOT);
        int count = string1.length()-1;
        for (int i = 0; i <= string1.length()-1; i++){
            if(string1.charAt(i) == string1.charAt(count)){
                count--;
            } else {
                b = false;
            }
        }
        return b;
    }

    public static String stringReplace(String string){
        String string1 = string.toLowerCase(Locale.ROOT);
        string1 = string1.replace("мат", "...");
        return string1;
    }

    public static int numberOfOccurrences(String string1, String string2){
        String stringMain = string1.toLowerCase(Locale.ROOT);
        String stringSecond = string2.toLowerCase(Locale.ROOT);
        int i = (stringMain.length() - stringMain.replace(stringSecond, "").length()) / stringSecond.length();
        return i;
    }
}
