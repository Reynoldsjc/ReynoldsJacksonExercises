import java.util.Scanner;
public class Dots{
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String firstWord = scan.nextLine();
        int first = firstWord.length();

        System.out.println("Enter second word:");
        String secondWord = scan.nextLine();
        int second = secondWord.length();

        int stringTotalLength = first + second;
        int totalLength = 30 - stringTotalLength;
        int amountOfDots = 0;

        while(totalLength > 0){
            totalLength = totalLength - 1;
            amountOfDots = amountOfDots + 1;    
        }

        System.out.print(firstWord);
        while(amountOfDots > 0){
            amountOfDots = amountOfDots - 1;
            System.out.print(".");
        }
        System.out.println(secondWord);



    }   
}