import java.util.Scanner;
import java.util.Random;
public class PasswordCracker {
    public static void main(String[] args) {
        boolean guessedIt = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 'secret' password that is 5 characters or less -->");
        String password = scan.nextLine();
        
        System.out.println("Here is your password: " + password);

        String library = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz!@#$%^&*()<>?:,./;'[]";
        
        Random random = new Random(); 
        String check = "initialize";
        int tries = 0;
        

        for(tries = 0;!check.equals(password);tries++ ){
            check = "";
            for(int total = 0; total<password.length(); total++){

                check += library.charAt(random.nextInt(library.length()));
            }
        }
        if(check.equals(password)){
            System.out.println("it took " + tries + " tries to guess it");
            System.out.println("Your password is : " + password);
        }

    }
}