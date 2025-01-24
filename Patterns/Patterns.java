/*
 * pattern-1
 *      ******
 *      ******
 *      ******
 *      ******
 */

package Patterns;

import java.util.*;

public class Patterns {

    static void pattern1(int rows, int cols) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int rows) {
        char c = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }

    static void pattern4(int rows) {

        for (int i = 0; i < rows; i++) {

            char startChar = (char) ('E' - i);

            for (int j = 0; j <= i; j++) {

                System.out.print(startChar + " ");
                startChar++;
            }
            System.out.println();
        }
    }

    static void pattern5(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    static void pattern6(int rows) {
        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
    // mysirg trick-----------------

    /*
     * *
     * **
     * ***
     * ****
     * *****
     */

    static void pattern7(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {

                if (j <= i) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
     * Pattern 8
     *
     **
     ***
     ****
     *****
     * 
     */

    static void pattern8(int rows) {
        int newCols = rows + 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j >= newCols - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
     * Pattern 9
     * *****
     * ****
     * ***
     * **
     * *
     */

    static void pattern9(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    /*
     * pattern10
     *****
     ****
     ***
     **
     *
     * 
     */

    static void pattern10(int rows) {

        int newCols = rows + 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= newCols - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /* pattern11

               *
              ***
             *****
            *******   
     */

     static void pattern11(int rows) {
        // Dynamically calculate the total columns needed for symmetry
        int cols = 2 * rows - 1; // Total columns will be based on rows
    
        // Middle column for symmetry
        int mid = (cols / 2) + 1;
    
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Check if the current column lies within the star range for this row
                if (j >= (mid - i + 1) && j <= (mid + i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    // Pattern 12

// ********
// ***  ***
// **    **
// *      *
static void pattern12(int rows) {
    
    int cols = 2*rows;

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(j < rows-i || j >= rows + i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int rows = sc.nextInt();

        // System.out.println("Enter number of columns: ");

        // int cols = sc.nextInt();

        // pattern1(rows, cols);
        // pattern2(rows);
        // pattern3(rows);
        // pattern4(rows);
        // pattern5(rows);
        // pattern7(rows);
        // pattern8(rows);
        // pattern9(rows);
        // pattern10(rows);
        // pattern11(rows);
        pattern12(rows);
    }
}
