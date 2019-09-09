import java.util.Scanner;
public class Discount {
public static void main(String[] args) {
    String amountSpent;
    amountSpent = new String("Enter amount of purchases: ");   
    Scanner scan = new Scanner(System.in);
    System.out.println(amountSpent);
    String inData = scan.nextLine();
    Double cost = Double.parseDouble(inData);
    Double discountAmount = .1;
    if(cost > 10) {
        Double finalPrice =(cost - (cost * discountAmount ));
        System.out.println("Discounted price: " + finalPrice);
    }
else
System.out.println("Sorry, no discount");

}
}