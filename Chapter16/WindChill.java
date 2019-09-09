import java.util.Scanner;
import java.lang.Math;
public class WindChill {
    public static void main(String[] args) {
        String speed;
        speed = new String("Enter Wind Speed: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(speed);
        String inData = scan.nextLine();
        Double windSpeed = Double.parseDouble(inData);
        Double v = windSpeed;
        Double x = 0.16;
        String temp;
        temp = new String("Enter Temperature: ");
        System.out.println(temp);
        String inData1 = scan.nextLine();
        Double temperature = Double.parseDouble(inData1);

        Double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(v, x) + 0.4275 * temperature * Math.pow(v, x);

        if(windSpeed < 3)
        System.out.println("Wind Chill: " + temperature);
        else if(temperature > 50)
        System.out.println("Wind Chill: " + temperature);
        else 
        
        System.out.println("Wind Chill: " + windChill);

    }
}