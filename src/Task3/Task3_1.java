package Task3;

public class Task3_1 {
    public static void main(String[] args) {
        SolutionClass s = new SolutionClass();
        System.out.println(s.solution(0, 10));
    }
}

class SolutionClass{
    double x;
    public double function(double b){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public double solution(double start, double end){
        if(end - start <= 0.001){
            return start;
        }
        double x = start + (end - start)/2;

        if(function(start) * function(x) > 0){
            return solution(x, end);
        } else{
            return solution(start, x);
        }
    }
}



