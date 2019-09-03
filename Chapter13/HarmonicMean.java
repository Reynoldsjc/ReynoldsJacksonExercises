    import java.util.Scanner;
    public class HarmonicMean {
    public static void main(String[] args) {
        String xInput;
        xInput = new String("Enter X: ");
        Scanner scan = new Scanner(System.in);

        System.out.println(xInput);
        String inData = scan.nextLine();
        Double xAmount = Double.parseDouble(inData);

        String yInput;
        yInput = new String("Enter Y: ");
        Scanner scan1 = new Scanner(System.in);

        System.out.println(yInput);
        String inData1 = scan1.nextLine();
        Double yAmount = Double.parseDouble(inData1);

        double Harmonic;
        Harmonic = 2 / ((1 / xAmount) + (1 / yAmount));
        
        double arithmeticMean;
        arithmeticMean = (xAmount + yAmount) / 2;

        System.out.println("Arithmetic Mean: " + arithmeticMean);
        System.out.println("Harmonic mean: " + Harmonic);


    }
}