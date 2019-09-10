import java.util.Scanner;
public class Internet {
public static void main(String[] args) {
    String itemName ;
    itemName = new String("Enter the item: ");   
    Scanner scan = new Scanner(System.in);
    System.out.println(itemName);
    String inData = scan.nextLine();

    String priceAmount ;
    priceAmount = new String("Enter the price: ");   
    System.out.println(priceAmount);
    String inData1 = scan.nextLine();
    Double price = Double.parseDouble(inData1);

    String delivery ;
    delivery = new String("Overnight delivery (0==no, 1==yes): ");   
    System.out.println(delivery);
    String inData2 = scan.nextLine();
    Double overnight = Double.parseDouble(inData2);

    if(overnight == 0) {
    if(price > 10) {
    System.out.println("Invoice:");
    System.out.println("    " + inData + "    " + price);
    System.out.println("    delivery    0.00");
    System.out.println("    total    " + price);
    }
    if(price < 10) {
    System.out.println("Invoice:");
    System.out.println("    " + inData + "    " + price);
    System.out.println("    delivery    " + 2.00);
    System.out.println("    total    " + (price + 2));
    }
    }

    else if(overnight == 1) {
    if(price > 10) {
    System.out.println("Invoice:");
    System.out.println("    " + inData + "    " + price);
    System.out.println("    delivery    3.00");
    System.out.println("    total    " + price);
    }
    if(price < 10) {
    System.out.println("Invoice:");
    System.out.println("    " + inData + "    " + price);
    System.out.println("    delivery    " + 5.00);
    System.out.println("    total    " + (price + 5.00));
    }
   }
    else
    System.out.println("An error has occured with your order.");
}
}