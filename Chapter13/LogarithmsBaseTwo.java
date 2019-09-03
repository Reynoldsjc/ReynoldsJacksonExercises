    import java.util.Scanner;
    public class LogarithmsBaseTwo {
        public static void main(String[] args) {
            String doubleInput;
            doubleInput = new String("Enter a double: ");
            Scanner scan = new Scanner(System.in);

            System.out.println(doubleInput);
            String inData = scan.nextLine();
            Double doubleLog = Double.parseDouble(inData);

            double baseLog;
            baseLog = Math.log(doubleLog) / Math.log(2);

            System.out.println("Base two log of " + doubleLog + " is " + baseLog);


    }
}