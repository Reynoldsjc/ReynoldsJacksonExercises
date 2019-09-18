import java.util.Scanner;
public class RunOfIntegers {
    public static void main (String[] args) {
        String startNumber = new String("Enter Start: ");   
        Scanner scan = new Scanner(System.in);
        System.out.println(startNumber);
        Integer start = Integer.parseInt(scan.nextLine());

        String endNumber = new String("Enter End: ");   
        System.out.println(endNumber);
        Integer end = Integer.parseInt(scan.nextLine());
        System.out.println("    ");
        System.out.println(start);

        while(start<end) {
        start = start + 1;
        System.out.println(start);
        }

    }
}