public class Geolocation {
    public static void main(String[] args) {
       String colorado = "Highlands Ranch";
       double latitude1 = 39.5481*(3.14/180);
       double longitude1 = 104.9739*(3.14/180);
       String newYork = "Manhattan";
       double latitude2 = 40.7831*(3.14/180);
       double longitude2 = 73.9712*(3.14/180);
       double earthradius = 6371;

       double aPart1 = Math.sin((latitude2-latitude1)/(2)) * Math.sin((longitude2-longitude1)/(2));
       double aPart2 = Math.cos(latitude1) * Math.cos(latitude2);
       double aPart3 = Math.sin((longitude2-longitude1)/(2)) * Math.sin((longitude2-longitude1)/(2));
       
       double a = aPart1 + aPart2 + aPart3;
       
       double cPart1 = 2;
       double cPart2 = Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
       double c = cPart1 * cPart2;

       double distance = earthradius * c;
       System.out.println(distance + "");

       
    }
}