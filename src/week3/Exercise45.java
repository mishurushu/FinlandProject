package week3;

public class Exercise45 {
    public static void main(String[] args) {
            int answer =  greatest(22, 7, 31);
            System.out.println("Greatest: " + answer);

    }

    public static int greatest(int a , int b , int c){
        int greatest = 0;
        if(a > b && a > c){
            greatest = a ;
        }else if (b > a && b > c){
            greatest = b;
        }else {
            greatest = c;
        }
        return greatest;
    }
}
