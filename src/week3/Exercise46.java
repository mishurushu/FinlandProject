package week3;

public class Exercise46 {
    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }

    public static double average(double a , double b , double c , double d){
        double average = (a + b + c + d) / 4;
        return average;
    }
}
