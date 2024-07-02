package Task1;

//1.3. Удаление из массива
public class Task1_3 {
    public static void main(String[] args) {
        int thirdArray[] = {0,0,0,4,3};
        String newString ="";
        int someNumber = 0;
        for(int i = 0; i < thirdArray.length; i++){
        if(thirdArray[i] != someNumber){
            newString = newString + Integer.toString(thirdArray[i]);
        }
        }
        int newArray [] = new int [newString.length()];
        for(int i = 0; i <newString.length(); i++){
            newArray[i] = Integer.parseInt(String.valueOf(newString.charAt(i)));
        }
        System.out.println("Array before delete");
        for(int i = 0; i < thirdArray.length; i ++){
            System.out.println(thirdArray[i]);
        }
        System.out.println("String after delete: " + newString);
        System.out.println("New Array after delete: ");
        for(int i = 0; i < newArray.length; i ++){
            System.out.println(newArray[i]);
        }


    }

}
