import java.util.Scanner;
public class OrderChecker {
    public static void main(String[] args) {
        String boltAmount;
        boltAmount = new String("Enter amount of bolts ");
        Scanner scan = new Scanner(System.in);
        System.out.println(boltAmount);   
        String inData = scan.nextLine();
        Integer totalbolts = Integer.parseInt(inData);
        int bolt = totalbolts;
        
        String nutAmount;
        nutAmount = new String("Enter amount of nuts ");   
        System.out.println(nutAmount);
        String inData1 = scan.nextLine();
        Integer totalnuts = Integer.parseInt(inData1);
        int nut = totalnuts;

        String washerAmount;
        washerAmount = new String("Enter amount of washers ");   
        System.out.println(washerAmount);
        String inData2 = scan.nextLine();
        Integer totalwashers = Integer.parseInt(inData2);
        int washer = totalwashers;
   if(nut < bolt) {
    System.out.println("Number of bolts: " + bolt);
    System.out.println("Number of nuts: " + nut);
    System.out.println("Number of washers: " + washer);
    System.out.println("Check the order: too few nuts");
   }
   else if((2*bolt) > washer) {
    System.out.println("Number of bolts: " + bolt);
    System.out.println("Number of nuts: " + nut);
    System.out.println("Number of washers: " + washer);
    System.out.println("Check the order: too few washers");
   }
   else {
       System.out.println("Order looks good!");
       int boltCost = 5;
       int nutCost = 3;
       int washerCost = 1;
       int totalCost =(bolt * boltCost) + (nut * nutCost) + (washer + washerCost)-1;
       System.out.println("Total Cost: " + totalCost + " cents");
   }



    }
}