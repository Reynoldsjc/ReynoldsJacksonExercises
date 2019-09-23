import java.util.Scanner;
public class MilesPerGallon
{
  public static void main (String[] args)
  {
    System.out.println("Miles Per Gallon Program");
    int i = 0;

    while (i == 0){
      Scanner scan = new Scanner(System.in);
      System.out.println("What's your initial miles?");
      int initialmiles = scan.nextInt();

      if (initialmiles >= 0){
        scan = new Scanner(System.in);
        System.out.println("What's your final miles??");
        int finalmiles = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("How many gallons did that take??");
        int gallons = scan.nextInt();

        double mpg = (finalmiles - initialmiles) / gallons;

        System.out.println("Your mpg is " + mpg);

      } else{
        System.out.println("bye");
        i += 1;
      }
    }

  }
}