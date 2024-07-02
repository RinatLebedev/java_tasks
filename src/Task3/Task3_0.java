package Task3;

public class Task3_0 {
    public static void main(String[] args) {
        int lengthOfBigArray = 1000;

        Array m = new Array();
        int [] bigArray = new int[lengthOfBigArray];
        int [] smallArray = {1,2,3,4,5,6,7,8,9};
        m.randomArrayDeneration(bigArray);
        System.out.println(" ");
        m.showArray(bigArray);

        long start = System.nanoTime();
        boolean find1 = m.simpleSearch(bigArray, 4);
        System.out.println(find1);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);


        start = System.nanoTime();
        int findHard1 = m.binarySearch(bigArray, 4);
        System.out.println(findHard1);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        System.out.println(" ");


        m.showArray(smallArray);

        start = System.nanoTime();
        boolean find = m.simpleSearch(bigArray, 4);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);

        start = System.nanoTime();
        int findHard = m.binarySearch(bigArray, 4);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);
    }
}
class Array{
    public boolean simpleSearch(int [] array, int key){
        boolean x = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                x = true;
            }
        }
        return x;
    }

    public int binarySearch(int[] array, int key){
        int x = binarySearchRecursively(array, key, 0, array.length);
        return x;
    }
    public int binarySearchRecursively(int [] array, int key, int low, int high) {
        int middle = (low + high) / 2;
        if (high < low) {
            return -1;
        }
        if (key == array[middle]) {
            return middle;
        } else if (key < array[middle]) {
            return binarySearchRecursively(
                    array, key, low, middle - 1);
        } else {
            return binarySearchRecursively(
                    array, key, middle + 1, high);
        }
    }

    public int [] randomArrayDeneration(int [] array){
        for(int i = 0; i < array.length; i ++){
            array[i] = (int) (Math.random()*10);
        }
        return array;
    }

    public void showArray(int [] array){
        System.out.println("Массив: ");
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}





