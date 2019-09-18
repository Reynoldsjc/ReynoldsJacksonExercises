import java.util.Scanner;
public class SumOfIntegers {
    public static void main (String[] args) {
        boolean done = false;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter N:");
        Integer n = Integer.parseInt(user.nextLine());
        int loop = 0;
        int one = 1;
        int sum = (n * (n + 1)) / 2;

        while(one < n){
        one = one + 1;
        done = false;
        }
        if(!done){
            loop = (sum*n)/one;
            System.out.println("Sum = " + sum);
            System.out.println("Loop Sum = " + loop);
        }
    }
}