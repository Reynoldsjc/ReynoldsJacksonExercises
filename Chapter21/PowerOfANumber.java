import java.util.Scanner;
public class PowerOfANumber {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X: ");
		double x = scan.nextDouble();

		scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		double n = scan.nextDouble();

		int i = 1;
		double product = x;

		while (i < n){
			product = x * product;
			i += 1;
		}

		if (n >= 0){
			System.out.println(x + " raised to the power of " + n + " is: " + product);
		} else{
			System.out.println("N must be a positive number!");
		}
	}
}
