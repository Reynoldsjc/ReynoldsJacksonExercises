import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

String changeInputKey;
changeInputKey = new String("Input the cents: ");
Scanner scan = new Scanner(System.in);

System.out.println(changeInputKey);
String inData = scan.nextLine();
Integer changeInput = Integer.parseInt(inData);

double dollars = changeInput / 100;
double penny = (changeInput % 100)/1;

System.out.println("That is " + dollars + " dollars and " + penny + " cents.");

    }
}