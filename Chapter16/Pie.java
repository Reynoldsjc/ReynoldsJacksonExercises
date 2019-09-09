import java.util.Scanner;
public class Pie {
    public static void main(String[] args) {
        String weight;
        weight = new String("Enter your weight in lbs: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(weight);
        String inData = scan.nextLine();
        Integer totalWeight = Integer.parseInt(inData);
        
        if(280 > totalWeight && totalWeight > 220)
        System.out.println("You qualify to get fat eating pies!");
        else
        System.out.println("Gain some or lose some weight");
    }
}