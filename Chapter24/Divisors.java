import java.util.Scanner;
public class Divisors{
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N value :");
        int n = scan.nextInt();

        int theSum = 0;
        int finalSum = 0;
        int aSum = 0;
        
        for (int sum = 1; sum<n ;sum++){
            theSum = n%sum;
            if(theSum == 0){
                finalSum = finalSum+sum;    
            }  
        }
        if(finalSum == n){
                System.out.println("N is a perfect number :)");
            }else{
                System.out.println("N is a non-perfect number");
            }
    }
}