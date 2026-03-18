package TCS_Coding_Questions;


//  A parking lot in a park has MxN number of parking spaces. Each parking space will either be empty(O) or full(1).
//  The status (0/1) of a parking space is represented as the element of the matrix.
//  The task is to find the row with have maximum number of cars parked in it.

//  Note :
//  MxN- Size of the matrix
//  M is the number of row and N is number of columns
//  Elements of the matrix M should be only O or 1.

//Input Format:
//I) The first line of input contains the value M the number of rows.
//2) The second line of input contains value N represents the number of columns.
//3) Next line contains a matrix with values 1 and O

//Output Format:
//Print the Row which have maximum number of cars parked in it.

//Sample Input 1:

//Matrix-0 1 0 0
//       1 1 0 1
//       1 1 1 1
//Output : 3 Row 3 have maximum number of 1.


import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int M = scanner.nextInt();

        System.out.print("Enter no of columns: ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];

        System.out.println("Enter Matrix data: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int value = scanner.nextInt();
                if(value == 1 || value == 0) {
                    matrix[i][j] = value;
                } else {
                    System.out.print("Invalid Input");
                    System.exit(0);
                }
            }
        }

        int[] count = new int[M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
               if(matrix[i][j] == 1) {
                   count[i] += 1;
               }
            }
        }

        int max = 0;
        int row = -1;
        for (int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                row = i;
            }
        }

        row += 1;

        System.out.print("row "+ row + " has maximum no. of parking i.e "+ max);


    }
}
