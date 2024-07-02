package Task5_0;

/*Постройте частотный словарь букв русского (или английского) алфавита.
Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "Эльвира любит Рината.";
        buildDictionaryWithMap(s1);
    }
    public static void buildDictionaryWithMap(String text) {
        text = text
                .toLowerCase(Locale.ROOT)
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "")
                .replace("?", "")
                .replace("!", "");
        Map<Character, Integer> dictionary = new HashMap<>();
        //Считываем и записываем в коллекцию
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
            if (dictionary.containsKey(text.charAt(i))) {
                j = dictionary.get(text.charAt(i));
                j += 1;
                dictionary.put(text.charAt(i), j);
            } else {
                dictionary.put(text.charAt(i), 1);
            }

        }
        //Сортировка
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(dictionary.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        //Выведение
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
