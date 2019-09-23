import java.util.Scanner;
public class HarmonicSum{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        Integer n = Integer.parseInt(scan.nextLine());
        
        int i = 0;
		double sum = 0;

		while (i < n){
			i += 1;
			sum = 1.0/i + sum;
        }
        System.out.println("Sum is: " + sum);
    }
}