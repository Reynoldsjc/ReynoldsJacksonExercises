import java.util.Scanner;
public class Lifespan {
    public static void main(String[] args) {
        String years;
        years = new String("Enter the amount of years you have lived: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(years);
        String inData = scan.nextLine();
        Integer year = Integer.parseInt(inData);
        
        String months;
        months = new String("Enter how many months(not including years) you have lived: ");
        System.out.println(months);
        String inData1 = scan.nextLine();
        Integer month = Integer.parseInt(inData1);
      
        String days;
        days = new String("Enter how many days you have lived (not including months and years) you have lived: ");
        System.out.println(days);
        String inData2 = scan.nextLine();
        Integer day = Integer.parseInt(inData2);

        if(month == 1) {
         double totalDaysAlive = (year * 365) + 31 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 2) {
         double totalDaysAlive = (year * 365) + 31 + 28 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 3) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 4) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

         else if(month == 4) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 5) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

         else if(month == 6) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + 30 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 7) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 8) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

        else if(month == 9) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }

         else if(month == 10) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }
        else if(month == 11) {
         double totalDaysAlive = (year * 365) + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        double ageSeconds = totalDaysAlive * 24 * 60 * 60;
        double percentLifespan = (ageSeconds / 2.5E9) * 100;
        System.out.println("You have lived approximately " + percentLifespan + " percent of your life");
        }
        else
        System.out.println("You must be dead!");
    }
}