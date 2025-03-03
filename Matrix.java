import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the number of rows in first matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns in first matrix: ");
        int c = sc.nextInt();
        System.out.print("Enter the number of rows in second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns in second matrix: ");
        int c2 = sc.nextInt();
        
        
        if(r==r2 && c==c2){
        // Declare two matrices
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r2][c2];
        
      // Read the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
       
        // Read the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
       
        // Perform matrix addition
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
       
        // Display the result matrix
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
       
        sc.close();
        }
     else{
        System.out.print("addtion not performed :");
        }
        }
        }
