import java.util.Scanner;
public class Dump {
public static void main(String[] args) {

    String TrashAmount ;
    TrashAmount = new String("Enter the amount of trash you have: ");   
    Scanner scan = new Scanner(System.in);
    System.out.println(TrashAmount);
    String inData = scan.nextLine();
    Double trash = Double.parseDouble(inData);

    Double totalCost = ((trash - 200) / 100 * 8) + 20;
    
    if(trash <= 200)
    System.out.println("You owe $20 in order for your trash to disposed");
    else
    System.out.println("You owe $" + totalCost + " in order for your trash to be disposed" );
}
}