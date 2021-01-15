// NAME: Austin Faulkner
// NetID: a_f408

// CLASS: MatrixAdditionAndMultiplication

// COURSE: CS 3354.251 - Object-Oriented Programming
// DATE: February 28, 2020
// DATE MODIFIED: March 4, 2020

/*
OBJECTIVE 2: You will create a general MxN matrix where M = number of rows and
             N = number columns that are specified by the user. Write a
             generic class of matrix that accepts user-defined N and M as input
             parameters and generates a random matrix. Each cell of the
             matrix is a random number.

             Example 1: Consider a 2x2 matrix: A = {{23, 54},
                                                    {98, 97}}

                        where A[i][j] is a random number between (0,99).

             Example 2: Consider a 3x3 matrix A = {{54, 43, 76},
                                                   {12, 98, 34},
                                                   {38, 43, 62}}

                        where A[i][j] is a random number between (0,99).

            Thus generate a random matrix A. Similarly you can generate matrices
            of other dimensions by specifying user values M and N .

            Perform your operations on these matrices.

            Design and write Java codes that solves the following:
               • Matrix Addition (2x2, 3x5)
               • Matrix Multiplication (2x2, 3x5)
            Show your results with your set of examples. You are free to choose
            the values of M and N.
*/

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

class MatrixAdditionAndMultiplication {
   public static int[][] populateM_2X2(PrintWriter pw) throws IOException {

      // Random # Populator:
      Random random = new Random();

      // Create a new matrix object reference
      int M_2X2[][] = new int[2][2];

      // Populate Matrix M_2X2:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix M_2X2: ");
      System.out.println("Matrix M_2X2: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for( int i = 0 ; i < M_2X2.length ; i++ ) {
         for ( int j = 0 ; j < M_2X2[i].length ; j++ ) {
            M_2X2[i][j] = random.nextInt(100);
         }
      }

      for(int [] m2by2 : M_2X2) {
         pw.println(Arrays.toString(m2by2));
         System.out.println(Arrays.toString(m2by2));
      }

      return M_2X2;
   }

   public static int[][] populateN_2X2(PrintWriter pw) {

      // Random # Populator:
      Random random = new Random();

      // Create a new matrix object reference
      int N_2X2[][] = new int[2][2];

      // Populate Matrix N_2X2:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix N_2X2: ");
      System.out.println("Matrix N_2X2: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for( int i = 0 ; i < N_2X2.length ; i++ ) {
         for ( int j = 0 ; j < N_2X2[i].length ; j++ ) {
            N_2X2[i][j] = random.nextInt(100);
         }
      }

      for(int [] n2by2 : N_2X2) {
         pw.println(Arrays.toString(n2by2));
         System.out.println(Arrays.toString(n2by2));
      }

      return N_2X2;
   }

   public static int[][] sumM_2X2AndN_2X2(int [][] M_2X2, int [][] N_2X2,
                                       PrintWriter pw) throws IOException {

      // Create a new matrix objext reference
      int sum_2X2[][] = new int[2][2];

      // Matrix Sum of M_2X2 and N_2X2:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix Sum of M_2X2 and N_2X2: ");
      System.out.println("Matrix Sum of M_2X2 and N_2X2: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
            sum_2X2[i][j] = M_2X2[i][j] + N_2X2[i][j];
         }
      }

      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
            pw.print(sum_2X2[i][j] + "\t");
            System.out.print(sum_2X2[i][j] + "\t");
         }
      System.out.println();
      pw.println();
      }

      return sum_2X2;
   }

   public static int[][] multiplyM_2X2AndN_2X2(int [][] M_2X2, int [][] N_2X2,
                                            PrintWriter pw) throws IOException {

      int rows_M_2X2 = 2;
      int numCols_M_2X2_MatchingNumRows_N_2X2 = 2;
      int cols_N_2X2 = 2;

      // Create a new matrix objext reference
      int product_2X2[][] = new int[rows_M_2X2][cols_N_2X2];

      // Matric Product of M_2X2 and N_2X2:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix Product of M_2X2 and N_2X2: ");
      System.out.println("Matrix Product of M_2X2 and N_2X2: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for(int i = 0; i < rows_M_2X2; i++) {
         for (int j = 0; j < cols_N_2X2; j++) {
            for (int k = 0; k < numCols_M_2X2_MatchingNumRows_N_2X2; k++) {
               product_2X2[i][j] += M_2X2[i][k] * N_2X2[k][j];
            }
         }
      }

      for(int[] row : product_2X2) {
         for (int column : row) {
            pw.print(column + "\t");
            System.out.print(column + "\t");
         }
         System.out.println();
         pw.println();
      }

      return product_2X2;
   }

   public static int[][] populateM1_3X5(PrintWriter pw) throws IOException {

      // Random # Populator:
      Random random = new Random();

      // Create a new matrix object reference
      int M1_3X5[][] = new int[3][5];

      // Populate Matrix M1_3X5:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix M1_3X5: ");
      System.out.println("Matrix M1_3X5: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for( int i = 0 ; i < M1_3X5.length ; i++ ) {
         for ( int j = 0 ; j < M1_3X5[i].length ; j++ ) {
            M1_3X5[i][j] = random.nextInt(100);
         }
      }

      for(int [] m1_3by5 : M1_3X5) {
         pw.println(Arrays.toString(m1_3by5));
         System.out.println(Arrays.toString(m1_3by5));
      }

      return M1_3X5;
   }

   public static int[][] populateM2_3X5(PrintWriter pw) throws IOException {

      // Random # Populator:
      Random random = new Random();

      // Create a new matrix object reference
      int M2_3X5[][] = new int[3][5];

      // Populate Matrix M2_3X5:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix M2_3X5: ");
      System.out.println("Matrix M2_3X5: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for( int i = 0 ; i < M2_3X5.length ; i++ ) {
         for ( int j = 0 ; j < M2_3X5[i].length ; j++ ) {
            M2_3X5[i][j] = random.nextInt(100);
         }
      }

      for(int [] m2_3by5 : M2_3X5) {
         pw.println(Arrays.toString(m2_3by5));
         System.out.println(Arrays.toString(m2_3by5));
      }

      return M2_3X5;
   }

   public static int[][] sumM1_3X5AndM2_3X5(int [][] M1_3X5, int [][] M2_3X5,
                                          PrintWriter pw) throws IOException {

      // Create a new matrix object reference
      int sum_3X5[][] = new int[3][5];

      // Matrix Sum of M1_3X5 and M2_3X5:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix Sum of M1_3X5 and M2_3X5: ");
      System.out.println("Matrix Sum of M1_3X5 and M2_3X5: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 5; j++) {
            sum_3X5[i][j] = M1_3X5[i][j] + M2_3X5[i][j];
         }
      }

      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 5; j++) {
            pw.print(sum_3X5[i][j] + "\t");
            System.out.print(sum_3X5[i][j] + "\t");
         }
      System.out.println();
      pw.println();
      }

      return sum_3X5;
   }

   public static int[][] populateN1_3X5(PrintWriter pw) throws IOException {

      // Random # Populator:
      Random random = new Random();

      // Create a new matrix object reference
      int N1_3X5[][] = new int[3][5];

      // Populate Matrix N1_3X5:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix N1_3X5: ");
      System.out.println("Matrix N1_3X5: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for( int i = 0 ; i < N1_3X5.length ; i++ ) {
         for ( int j = 0 ; j < N1_3X5[i].length ; j++ ) {
            N1_3X5[i][j] = random.nextInt(100);
         }
      }

      for(int [] n1_3by5 : N1_3X5) {
         pw.println(Arrays.toString(n1_3by5));
         System.out.println(Arrays.toString(n1_3by5));
      }

      return N1_3X5;
   }

   public static int[][] populateN2_5X3(PrintWriter pw) throws IOException {

      // Random # Populator:
      Random random = new Random();

      // Create a new matrix object reference
      int N2_5X3[][] = new int[5][3];

      // Populate Matrix N2_5X3:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix N2_5X3: ");
      System.out.println("Matrix N2_5X3: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for( int i = 0 ; i < N2_5X3.length ; i++ ) {
         for ( int j = 0 ; j < N2_5X3[i].length ; j++ ) {
            N2_5X3[i][j] = random.nextInt(100);
         }
      }

      for(int [] n2_5by3 : N2_5X3) {
         pw.println(Arrays.toString(n2_5by3));
         System.out.println(Arrays.toString(n2_5by3));
      }

      return N2_5X3;
   }

   public static int[][] multiplyN1_3X5AndN2_5X3(int [][] N1_3X5, int [][] N2_5X3,
                                            PrintWriter pw) throws IOException {

      int rows_N1_3X5 = 3;
      int numCols_N1_3X5_MatchingNumRows_N2_5X3 = 5;
      int cols_N2_5X3 = 3;

      // Create a new matrix object reference
      int product_3X3[][] = new int[rows_N1_3X5][cols_N2_5X3];

      // Matrix Product of N1_3X5 and N2_5X3:
      pw.println();
      pw.println();
      System.out.println();
      System.out.println();
      pw.println("Matrix Product of N1_3X5 and N2_5X3: ");
      System.out.println("Matrix Product of N1_3X5 and N2_5X3: ");
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      for(int i = 0; i < rows_N1_3X5; i++) {
         for (int j = 0; j < cols_N2_5X3; j++) {
            for (int k = 0; k < numCols_N1_3X5_MatchingNumRows_N2_5X3; k++) {
               product_3X3[i][j] += N1_3X5[i][k] * N2_5X3[k][j];
            }
         }
      }

      for(int[] row : product_3X3) {
         for (int column : row) {
            pw.print(column + "\t");
            System.out.print(column + "\t");
         }
         System.out.println();
         pw.println();
      }
      System.out.println();
      System.out.println();
      pw.println();
      pw.println();

      return product_3X3;
   }

   // Test Driver:
   public static void main(String [] args) {

      // Instance variables
      String input;
      char repeat;

      // Matrices:
      int M_2X2[][] = new int[2][2];
      int N_2X2[][] = new int[2][2];
      int sum_2X2[][] = new int[2][2];
      int product_2X2[][] = new int[2][2];

      int M1_3X5[][] = new int[3][5];
      int M2_3X5[][] = new int[3][5];
      int sum_3X5[][] = new int[3][5];

      int N1_3X5[][] = new int[3][5];
      int N2_5X3[][] = new int[5][3];
      int product_3X3[][] = new int[3][3];

      try {
         do {

            // For printing file output and appending (the "true": append mode)
            PrintWriter pw = new PrintWriter(
                                       new FileWriter("output_file.txt", true));

            // Title
            pw.println();
            pw.println();
            pw.println("******THIS PROGRAM ADDS AND MULTIPLIES MATRICES******");
            System.out.println();
            System.out.println();
            System.out.println("******THIS PROGRAM ADDS AND MULTIPLIES " +
                                                               "MATRICES******");

            MatrixAdditionAndMultiplication mo =
                                           new MatrixAdditionAndMultiplication();

            // Condtions for summation and multiplication of 2-by-2 matrices
            M_2X2 = mo.populateM_2X2(pw);
            N_2X2 = mo.populateN_2X2(pw);
            sum_2X2 = mo.sumM_2X2AndN_2X2(M_2X2, N_2X2, pw);
            product_2X2 = mo.multiplyM_2X2AndN_2X2(M_2X2, N_2X2, pw);

            // Conditions for summation of 3-by-5 matrices
            M1_3X5 = mo.populateM1_3X5(pw);
            M2_3X5 = mo.populateM2_3X5(pw);
            sum_3X5 = mo.sumM1_3X5AndM2_3X5(M1_3X5, M2_3X5, pw);

            // Conditions for the multiplication of a 3-by-5 and 5-by-3 matrix
            N1_3X5 = mo.populateN1_3X5(pw);
            N2_5X3 = mo.populateN2_5X3(pw);
            product_3X3 = mo.multiplyN1_3X5AndN2_5X3(N1_3X5, N2_5X3, pw);

            // Prompt to run the program again
            pw.print("Would you like to play again (Y/N)? ");
            System.out.print("Would you like to play again (Y/N)? ");

            // Scanner input: String --> Char --> (Store in 'repeat')
            Scanner keyboard = new Scanner(System.in);
            input = keyboard.next();       // Read a string
            repeat = input.charAt(0);      // Get the first char
            pw.println(repeat);

            if ((repeat == 'N') || (repeat == 'n')) {
               System.out.println();
               System.out.println("I hope you enjoyed the COOL MATHEMATICS! " +
                                                                   "Goodbye!");
               pw.println();
               pw.println("I hope you enjoyed the COOL MATHEMATICS! Goodbye!");
            }

            pw.close();

         } while (repeat == 'Y' || repeat == 'y');
      } catch (IOException exc) {
         exc.printStackTrace();
         System.out.println("File Output Error.");
      }
   }
}
