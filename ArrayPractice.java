import java.util.Arrays;
public class ArrayPractice {
public static void main(String [] args) {
int [][] numberGrid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
    {0}
};
for(int i = 0; i < numberGrid.length; i++) {
    for(int j = 0; j < numberGrid[i].length; j++) {
        System.out.print(numberGrid[i][j]);
    }
    System.out.println();
}
}
}

//Shift all zeros of an array to the right

//Input: (0,1,2,0,3,0)
//Output: (1,2,3,0,0,0)

//function shift(Arr) {
    //for(i=0, i<Arr.length; i++) {
       // if(Arr[i]==0) {
           // j = findnz(i) 
     //   }
 //   }
//}

class Basics {

    public static void main(String args[]) {
        
        // initializing two dimensional array as literal
        String[][] names = { 
                            {"John", "Smith"},
                            {"Javin", "Paul"},
                            {"James", "Gosling"},
                           };

        // how to initialize two dimensional array in Java
        // using for loop
        int[][] board = new int[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i + j;
            }
        }

        // now let's print a two dimensional array in Java
        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
        
        // printing 2D array using Arrays.deepToString() method
        System.out.println("another way to print 2D arrays");
        System.out.println(Arrays.deepToString(board));

    }

}

double [][] matrix = new double[3][4]; //matrix refrences a 3 by 4 
                                       //array of real numbers
                                       //each element has a value of 0.0
String [][] strs = new String [2] [5]; //strs refrences a 2 by 5
                                       //array of string objects
                                       //Each element is null
//Question #1: what makes a value null?

for (int[] row : mat)   //for each row array in mat
    for (int element : row) //for each element in this row
        sum += element

//Question #2: what is the point of the colon in this case?


////
int sum = 0
for (int row = 0; row < mat.length; row++) //for each row in the mat
sum += sumArray(mat[row]);  // add that row's total to sums, 

for (int c = 0; c < mat[2])

                                    