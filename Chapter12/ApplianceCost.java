import java.util.Scanner;
public class ApplianceCost {
    public static void main(String[] args) {
        String Cost;
        Cost = new String("Enter cost per kilowatt-hour in cents ");
        Scanner scan = new Scanner(System.in);
        System.out.println(Cost);
        String inData = scan.nextLine();
        Double Cents = Double.parseDouble(inData);

        String perYear;
        perYear = new String("Enter kilowatt-hours used per year ");
        Scanner scan1 = new Scanner(System.in);
        System.out.println(perYear);
        String inData1 = scan1.nextLine();
        Double Hours = Double.parseDouble(inData1);

        double annualCost = (Cents / 100) * Hours;
        System.out.println("Annual cost: " + annualCost);



    }
}