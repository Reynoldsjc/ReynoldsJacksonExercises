import java.util.Scanner;
public class SignUp {
public static void main(String[] args) {
        String signUpUsername;
        signUpUsername = new String("Enter a username: ");
        Scanner scanUsername = new Scanner(System.in);
        System.out.println(signUpUsername);
        String inData = scanUsername.nextLine();

        String takenUsername1 = "admin person";
        String takenUsername2 = "jimbob234";
        String takenUsername3 = "gary";
        String takenUsername4 = "skater_gurl17";

        if(inData.equals(takenUsername1)) {
                System.out.println("Username taken");
                }
        else if(inData.equals(takenUsername2)) {
                System.out.println("Username taken");
        }
         else if(inData.equals(takenUsername3)) {
                System.out.println("Username taken");
        }
         else if(inData.equals(takenUsername4)) {
                System.out.println("Username taken");
        }
        else {System.out.println("Great Choice! Now choose a password!");
        String signUpPassword;
        signUpPassword = new String("Enter a password: ");
        Scanner scanPassword = new Scanner(System.in);
        System.out.println(signUpPassword);
        String inData1 = scanPassword.nextLine();
        }
        if()

         
        
        
}
}