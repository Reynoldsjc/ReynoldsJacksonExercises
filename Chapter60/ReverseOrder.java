class ReverseOrder
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3};
    int temp;

    System.out.println( "Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    // reverse the order of the numbers in the array

    for (int i = 0; i < 2; i++){
      temp = val[i];
      val[i] =  val[3 - i];
      val[3 - i] = temp;;
    }


    System.out.println( "Reversed Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}