package Task1;

//1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class Task1_1 {
    public static void main(String[] args) {
        int arraySize = 15;
        int firstArray [] = new int[arraySize];
        for(int i=0; i< firstArray.length; i++){
            firstArray[i] = (int) (Math.random()*10);
        }

        int sort = 0;
        for(int i = 0; i <= firstArray.length; i++){
            for(int j = 0; j < (firstArray.length)-1; j++) {
                sort = firstArray[j];
                if(firstArray[j]>firstArray[j+1]) {
                    firstArray[j] = firstArray[j + 1];
                    firstArray[j + 1] = sort;
                }
            }
        }

        for(int i=0; i< firstArray.length; i++){
            System.out.println(firstArray[i]);
        }
    }
}
