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


    static void pattern1(int rows,int cols){

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int rows){

        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int rows){
        char c = 'A';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }

    static void pattern4(int rows){

        for(int i=0;i<rows;i++){
            
            char startChar = (char) ('E' - i);

            for(int j=0;j<=i;j++){
                
                System.out.print(startChar + " ");
                startChar++;
            }
            System.out.println();
        }
    }

    static void pattern5(int rows){

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i-1;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int rows = sc.nextInt();

        // System.out.println("Enter number of columns: ");

        // int cols = sc.nextInt();

        // pattern1(rows, cols);
        // pattern2(rows);
        // pattern3(rows);
        // pattern4(rows);
        pattern5(rows);
    }
}






