import java.util.Scanner;
public class TriangleAndSquare{

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number: ");

        int pattern = 1;
        int max = scan.nextInt();
        int add = 2;

        int squarePattern = 1;
        int squareAdd = 3;

        while(pattern <= max || squarePattern <= max) {
            System.out.println( pattern + " " + squarePattern);
            pattern = pattern + add;
            squarePattern = squarePattern + squareAdd;
            add++;
            squareAdd = squareAdd +2;
        }
        
    }
}