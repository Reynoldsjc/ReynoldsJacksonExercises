import java.util.Scanner;
public class AddingUpIntegers{
    public static void main(String []args){

        Scanner integer = new Scanner(System.in);
        System.out.println("How many Integers will be added:");
        Integer totalIntegers = Integer.parseInt(integer.nextLine());
        int sum = 0;

        while(totalIntegers>0){
            System.out.println("Enter an Integer:");
            Integer newInt= Integer.parseInt(integer.nextLine());
            sum = sum + newInt;
            totalIntegers--;
        }
        System.out.println("The sum is "+sum);

    }
}