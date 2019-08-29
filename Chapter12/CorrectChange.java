import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {

String totalChangeInput;
totalChangeInput = new String("Input the cents: ");
Scanner scan = new Scanner(System.in);

System.out.println(totalChangeInput);
String inData = scan.nextLine();
Integer changeInput = Integer.parseInt(inData);

Integer dollars = changeInput / 100;
Integer quarters = (changeInput - dollars * 100) / 25;
Integer dimes = (changeInput - dollars * 100 - quarters * 25) / 10;
Integer nickels = (changeInput - dollars * 100 - quarters * 25 - dimes * 10) / 5;
Integer pennies = (changeInput - dollars * 100 - quarters * 25 - dimes * 10 - nickels * 5) / 1;

System.out.println("That is " + dollars + " dollars and " + quarters + " quarters and " + dimes + " dimes and " + nickels + " nickels and " + pennies + " pennies.");

    }
}