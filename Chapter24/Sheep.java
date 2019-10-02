import java.util.Scanner;
public class Sheep{
    public static void main (String []args){
        double n = 0;
        for(int t = 0; t<=25 ; t++){
            double pow = Math.pow(0.83,t)*10;
            n = 220/(1+pow);
            System.out.println("The population after " + t +" years is " + n);
        }  
    }
}
