import java.util.Scanner;
public class SubstringFun {
public static void main(String[] args) {

    String enterString;
    enterString = new String("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    System.out.println(enterString);
    String stringInput = sc.nextLine();
   
    String enterBIndex;
    enterBIndex = new String("Enter beginning index: ");
    Scanner sc1 = new Scanner(System.in);
    System.out.println(enterBIndex);
    String inData1 = sc1.nextLine();
    Integer bIndexInput = Integer.parseInt(inData1);

    String enterEIndex;
    enterEIndex = new String("Enter ending index: ");
    Scanner sc2 = new Scanner(System.in);
    System.out.println(enterEIndex);
    String inData2 = sc2.nextLine();
    Integer eIndexInput = Integer.parseInt(inData2);
    
    System.out.println("Original String:" + stringInput);
    
    String sub = stringInput.substring(bIndexInput, eIndexInput);
    System.out.println(sub);


}
}