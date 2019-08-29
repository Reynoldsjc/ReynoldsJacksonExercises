    import java.util.Scanner;
    public class OhmsLaw {
    public static void main(String[] args) {
        String voltageInput;
        voltageInput = new String("Type the amount of Voltage: ");
        Scanner scan = new Scanner(System.in);

        System.out.println(voltageInput);
        String inData = scan.nextLine();
        Integer Voltage = Integer.parseInt(inData);

        String resistanceInput;
        resistanceInput = new String("Type the amount of Resistance: ");
        Scanner scan1 = new Scanner(System.in);

        System.out.println(resistanceInput);
        String inData1 = scan1.nextLine();
        Integer Resistance = Integer.parseInt(inData1);

        double Current;
        Current = (Voltage + 0.0) / Resistance;

        System.out.println("The amount of Current is " + Current);


    }
}