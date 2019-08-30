import java.util.Scanner;
public class DistanceBrickTravels {
    public static void main(String[] args) {

        String enterSeconds;
        enterSeconds = new String("Enter the number of seconds: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(enterSeconds);
        String inData = scan.nextLine();
        Double secondsInput = Double.parseDouble(inData);

        double calculation = .5 * 32.174 * secondsInput * secondsInput;
        System.out.println("Distance: " + calculation);
    }
}