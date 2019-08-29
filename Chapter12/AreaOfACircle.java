import java.util.Scanner;
public class AreaOfACircle {
public static void main (String[] args) {
String radiusInputKey;
radiusInputKey = new String("Input the radius");
Scanner scan = new Scanner(System.in);

System.out.println(radiusInputKey);
String inData = scan.nextLine();
Integer radiusInput = Integer.parseInt(inData);

double radiusInputSquared = radiusInput * radiusInput;
double areaCircle = radiusInputSquared * Math.PI;
System.out.println("The area is: " + areaCircle);
}
}