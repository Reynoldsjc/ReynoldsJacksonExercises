import java.util.Scanner;
public class CheckCharge {
public static void main(String[] args) {

    String checkingAmount ;
    checkingAmount = new String("Enter the amount you have in you Checking Account: ");   
    Scanner scan = new Scanner(System.in);
    System.out.println(checkingAmount);
    String inData = scan.nextLine();
    Double checking = Double.parseDouble(inData);

    String savingsAmount ;
    savingsAmount = new String("Enter the amount you have in you Savings Account: ");   
    System.out.println(savingsAmount);
    String inData1 = scan.nextLine();
    Double savings = Double.parseDouble(inData1);

    if(checking >= 1000)
    System.out.println("There is no service charge for the check.");
    if(savings >= 1500)
    System.out.println("There is no service charge for the check.");
    else
    System.out.println("There is a 15 cent charge for the check.");
}
}