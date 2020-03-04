package week3;

public class Exercise44 {
    public static void main(String[] args) {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }

    public static int least (int a, int b){
       int least = 0;
       if(a<b){
           least = a;
       }else{
           least = b ;
        }
       return least;
    }

}
