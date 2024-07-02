package Task2;

//2.1. Генерация случайного элемента с весом

public class Task2_1 {
    int [] probabilityArray;
    int [] variableArray;
    int [] weightArray;


    Task2_1(int [] variables, int [] weights){
        this.variableArray = variables;
        this.weightArray = weights;
    }

    public int [] newArrayCreating(int [] variableArray, int [] weightArray) {
        int newLength = 0;
        for (int i = 0; i < weightArray.length; i++) {
            newLength += weightArray[i];
        }
        probabilityArray = new int[newLength];
        int count = 0;
        for (int i = 0; i < weightArray.length; i++)
            for (int j = 0; j < weightArray[i]; j++) {
                probabilityArray[count] = variableArray[i];
                count++;
            }
        return probabilityArray;
    }

    public int randomNumberGeneration(){
        int randomNumber = (int) (Math.random() * (newArrayCreating(variableArray, weightArray).length - 1));
        return probabilityArray[randomNumber];
    }

    public void showNewArray(){
        System.out.println("Массив: ");
        for(int i = 0; i < (newArrayCreating(variableArray, weightArray).length); i++){
            System.out.print(probabilityArray[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int [] variableArray = {1,2,3};
        int [] weightArray = {5,2,8};
        Task2_1 number = new Task2_1(variableArray, weightArray);
        number.showNewArray();
        System.out.println("Случайное число: " + number.randomNumberGeneration());
    }
}
