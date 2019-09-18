import java.util.Scanner;
public class Taxes {
    public static void main (String[] args) {
        double taxRate = 0.0;
        String yearlyIncome;
        yearlyIncome = new String ("Eneter your yearly income in dollars: $");
        Scanner scan = new Scanner (System.in);
        System.out.print(yearlyIncome);
        String income = scan.nextLine();
        Integer totalIncome = Integer.parseInt(income);

            if(totalIncome > 0 && totalIncome <= 15000) {
                System.out.println("Today is your lucky day");
                System.out.println("You don't have to pay taxes!");
            }
            else if(totalIncome > 15000 && totalIncome <= 35000) {
                taxRate = .1;
            }
             else if(totalIncome > 35000 && totalIncome <= 65000) {
                taxRate = .16;
            }
             else if(totalIncome > 65000 && totalIncome <= 105000) {
                taxRate = .19;
            }
             else if(totalIncome > 105000) {
                taxRate = .22;
            }
            
            double totalTaxAmount = (totalIncome * taxRate)-2000;
            System.out.println("Total tax amount: " + totalTaxAmount);
    }
}