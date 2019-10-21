import java.util.Scanner;
import java.util.Random;

public class SquareRoot{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("First Player, sign in--> ");
        String user1 = scan.nextLine();
        System.out.println("Second Player, sign in--> ");
        String user2 = scan.nextLine();
        System.out.println("User 1 is " + user1 + " User 2 is " + user2 );
        int points1 = 0;
        int points2 = 0;

        System.out.println("How many rounds?");

        for(int rounds= scan.nextInt(); rounds>0; rounds--){
            double number = random.nextInt(100)+1;
            System.out.println("what is the square root of  " + number);
            double answer = Math.sqrt(number);
            System.out.println("what is your answer " + user1 +"?");
            double answer1 = scan.nextDouble();
            System.out.println("what is your answer " + user2 +"?");
            double answer2 = scan.nextDouble();
            if(Math.abs(answer1-answer) <= Math.abs(answer2-answer)){
                System.out.println(user1 + " is closer! " + user1 +" gets the point!");
                points1=points1+1;
            } else{
                System.out.println(user2 + " is closer  " + user2 + " gets the point!");
                points2=points2+1;
            }
            System.out.println("The correct Square Root: " + answer);
            System.out.println("current score: " + user1 + " has " + points1 + " " +user2 + "  has " + points2);
           
        }

        if(points1>points2){
            System.out.println(user1 + " wins the game");
            System.out.println("Final score : ");
            System.out.println(user1 + " has " + points1);
            System.out.println(user2 + " has " + points2);
        }else{
            System.out.println(user2 + " wins the game");
            System.out.println("Final score : ");
            System.out.println(user1 + " has " + points1);
            System.out.println(user2 + " has " + points2);
        }
       
        
    }
}