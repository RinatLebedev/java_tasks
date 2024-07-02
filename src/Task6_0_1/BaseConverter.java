package Task6_0_1;

import java.util.Locale;
import java.util.Scanner;

class BaseConverter{
    private double x;
    private String y;
    public void convert(double x, String y){
        if(!y.equals("")&&(x>=-273.15)){
            y = y.toLowerCase(Locale.ROOT);
            switch (y){
                case "кельвины":
                    x = x + 273.15;
                    break;
                case "фаренгейты":
                    x = x*1.8+32;
                    break;
                case "реомюры":
                    x = x*0.8;
                    break;
                default:
                    System.out.println("Не знаю такую единицу измерения");
            }
            String z = String.valueOf(y.charAt(0));
            y = y.
                    replace("ы", "ов")
                    .replace(z, z.toUpperCase(Locale.ROOT));
            System.out.println(x + " " + y);
        } else if (y.equals("")){
            System.out.println("Укажите единицу измерения для конвертации");
            Scanner scanner1 = new Scanner(System.in);
            String newString = scanner1.nextLine();
            convert(x, newString);
        } else if(x<-273.15){
            System.out.println("Вы ввели температуру, которой не может быть в природе.\nВведите температуру ещё раз: ");
            Scanner scanner2 = new Scanner(System.in);
            int newInt = scanner2.nextInt();
            convert(newInt, y);
        }

    }
}
