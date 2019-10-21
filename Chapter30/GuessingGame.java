import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main (String[] args) {

        Random num = new Random();
        int finalNum = num.nextInt(10) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");

          boolean right = false;
        for(int guesses = 3 ; guesses>0 ; guesses--){
            System.out.println("Enter a guess");
            int guess = scan.nextInt();
            if(guess == finalNum){
                System.out.println("RIGHT!");
                right = true;
                guesses = 0;
            }else{
                System.out.println("wrong");
                right = false;
            }

        }
        if(!right){
            System.out.println("Sorry you lost");
            System.out.println("The correct number was " + finalNum);
        }



        

        

    }
}