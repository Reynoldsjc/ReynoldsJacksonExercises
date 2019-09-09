import java.util.Scanner;
public class Gas {
    public static void main(String[] args) {
        String gasTank;
        gasTank = new String("Tank capacity: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(gasTank);   
        String inData = scan.nextLine();
        Integer totalGas = Integer.parseInt(inData);
        int gasTotal = totalGas;

        String gasPercent;
        gasPercent = new String("Gage reading: ");
        System.out.println(gasPercent);   
        String inData1 = scan.nextLine();
        Integer totalPercent = Integer.parseInt(inData1);
        int gageTotal = totalPercent;
        
        String MPG;
        MPG = new String("Miles per gallon: ");
        System.out.println(MPG);   
        String inData2 = scan.nextLine();
        Integer totalMPG = Integer.parseInt(inData2);
        int mPGTotal = totalMPG;
        double gasFinal = ((gageTotal * .01) * gasTotal) * mPGTotal;

        if(gasFinal < 200) 
        System.out.println("Get Gas or suffer in the desert!");
        else
        System.out.println("You're good to go!");
    }
}