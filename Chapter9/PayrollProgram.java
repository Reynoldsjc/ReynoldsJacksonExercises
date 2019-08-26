public class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked; 
    hoursWorked = 40;   
    
    double payRate;
    payRate = 12.25; 
    
    double taxRate;
    taxRate = 0.137;    

    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
    System.out.println("Total pay amount: " + ((hoursWorked * payRate) - (hoursWorked * payRate * taxRate)));
  }
}