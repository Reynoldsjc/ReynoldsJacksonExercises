import java.util.Scanner;
public class Odd {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert n");
        int n = scan.nextInt();
        int totalOddSum=0;
        double nS = Math.pow(n,2);
        for(int oddNumb = 1 ; oddNumb<=n ; oddNumb+=2){
            totalOddSum+=oddNumb;
    
        }
        System.out.println("The sum is " + totalOddSum);
        System.out.println("N^2 is " + nS);

    
    }
}