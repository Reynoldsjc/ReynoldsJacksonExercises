import java.util.Scanner;
import java.util.Random;
public class MultiplicationQuiz
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int i = 0;
		int amountright = 0;

		while (i < 10){
			int first = rand.nextInt(+10);
			int second = rand.nextInt(+10);
			System.out.println("What is " + first + " times " + second);
			int input = scan.nextInt();
			int product = first * second;
			i += 1;
			if (product == input){
				System.out.println("Nice!");
				amountright += 1;
			} else{
				System.out.println("You are terrible. " + first + " times " + second + " equals " + product);
			}
		}

		System.out.println("Dang, you got " + amountright + " out of 10 questions right.");
	}
}

