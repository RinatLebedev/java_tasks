package Task2;

//2.0. Проектирование и создание класса, описывающего вектор

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector[] randomArrayMethod(int N){
        Vector[] vector = new Vector[N];
        for (int i =0; i < N; i++){
            vector[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vector;
    }

    public double vectorLength(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector vector){
        double newVector = x*vector.x + y*vector.y + z*vector.z;
        return newVector;
    }

    public Vector vectorProduct(Vector vector){
        Vector newVector= new Vector(y*z - z*vector.y,z*vector.x - x*vector.z,x*vector.y - y*vector.x);
        return newVector;
    }

    public double angleBetweenVectors(Vector vector){
        double countOfAngleBetweenVectors = scalarProduct(vector) / (vectorLength()*vector.vectorLength());
        return countOfAngleBetweenVectors;
    }

    public Vector additionOfVectors(Vector vector){
        Vector newVector = new Vector(x+vector.x, y+vector.y, z+vector.z);
        return newVector;
    }

    public Vector substractionOfVectors(Vector vector){
        Vector newVector = new Vector(x-vector.x, y-vector.y, z-vector.z);
        return newVector;
    }


    public static void main(String[] args) {
        Vector [] vector = Vector.randomArrayMethod(5);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[0].vectorLength());
        System.out.println(vector[0].scalarProduct(vector[1]));
        System.out.println(vector[0].vectorProduct(vector[1]));
        System.out.println(vector[0].angleBetweenVectors(vector[1]));
        System.out.println(vector[0].additionOfVectors(vector[1]));
        System.out.println(vector[0].substractionOfVectors(vector[1]));
    }
}

