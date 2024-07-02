package Task1;

//1.0. Максимальное, минимальное и среднее значение
public class Task1_0 {
    public static void main(String [] args){
        int arraySize = 20;
        float firstArray [] = new float[arraySize];
        for(int i=0; i< firstArray.length; i++){
            firstArray[i] = (float) Math.random();
        }

        float maxValue = firstArray[0];
        float minValue = firstArray[0];
        float averageValue = firstArray[0];

        for(int i=0; i< firstArray.length; i++){
            if(maxValue < firstArray[i]){
                maxValue = firstArray[i];
            }
            if(minValue > firstArray[i]);{
                minValue = firstArray[i];
            }
            averageValue += firstArray[i]/firstArray.length;
        }

        System.out.println("Наибольшее число в массиве: "+ maxValue);
        System.out.println("Наименьшее число в массиве: "+ minValue);
        System.out.println("Среднее значение в массиве: "+ averageValue);
    }
}
