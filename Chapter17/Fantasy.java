import java.util.Scanner;
public class Fantasy {
public static void main(String[] args) {
    System.out.println("Welcome to the Knight's quest");
    
    String characterName ;
    characterName = new String("Enter the name of your character: ");   
    Scanner scan = new Scanner(System.in);
    System.out.println(characterName);
    String inData = scan.nextLine();
    
    String strengthAmount ;
    strengthAmount = new String("Enter strength (1 to 10): ");   
    System.out.println(strengthAmount);
    String inDataA = scan.nextLine();
    Integer inData1 = Integer.parseInt(inDataA);

    String healthAmount ;
    healthAmount = new String("Enter health (1 to 10): ");   
    System.out.println(healthAmount);
    String inDataB = scan.nextLine();
    Integer inData2 = Integer.parseInt(inDataB);

    String luckAmount ;
    luckAmount = new String("Enter luck (1 to 10): ");   
    System.out.println(luckAmount);
    String inDataC = scan.nextLine();
    Integer inData3 = Integer.parseInt(inDataC);

    Integer totalPower = inData1 + inData2 + inData3;

    if(totalPower <= 15)
    System.out.println(inData + ", strength: " + inData1 + ", health: " + inData2 + ", luck: " + inData3);

    else
    System.out.println("You have given your character too many points!  Default values have been assigned: ");
     System.out.println(inData + ", strength: " + 5 + ", health: " + 5 + ", luck: " + 5);

}
}