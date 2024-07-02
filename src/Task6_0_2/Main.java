package Task6_0_2;

public class Main {
    public static void main(String[] args) {
        double x = 100;
        Kelvin kelvin = new Kelvin();
        Fahrenheit fahrenheit = new Fahrenheit();
        Reaumur reaumur = new Reaumur();
        System.out.println(kelvin.convert(x));
        System.out.println(fahrenheit.convert(x));
        System.out.println(reaumur.convert(x));
    }
}
interface BaseConverter{
    double convert(double x);
}

class Kelvin implements BaseConverter{
    @Override
    public double convert(double x){
        return x + 273.15;
    }
}

class Fahrenheit implements BaseConverter{
    @Override
    public double convert(double x){
        return x * 1.8 + 32;
    }
}

class Reaumur implements BaseConverter{
    @Override
    public double convert(double x){
        return x * 0.8;
    }
}

