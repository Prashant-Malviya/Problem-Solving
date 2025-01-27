package Arrays;

import java.util.*;

public class Arrays {

    static void sumAndMultiplication(int[] arr){
        int sum = 0;
        int multiplication = 1;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        for(int i=0;i<arr.length;i++){
            multiplication *= arr[i];
        }

        System.out.println("sum is = "+ sum + "and multiplication is "+multiplication);

    }

    static void sumOfEvenAndOddNumber(int[] arr){
        int evenSum = 0, oddSum = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenSum += arr[i];
            }else{
                oddSum += arr[i];
            }
        }

        System.out.println("even sum is "+evenSum +" and odd sum is "+oddSum);
    }


    static void sumOfEvenIdxAndOddIdx(int[] arr){
        int evenIdxSum = 0, oddIdxSum = 0;

        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                evenIdxSum += arr[i];
            }else{
                oddIdxSum += arr[i];
            }
        }

        System.out.println("even idx sum is "+ evenIdxSum + " odd idx sum is "+oddIdxSum);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter Arr Elements: ");

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Here is the array elements: ");

        for(int e: arr){
            System.out.println(e);
        }

        // sumAndMultiplication(arr);

        // sumOfEvenAndOddNumber(arr);

        sumOfEvenIdxAndOddIdx(arr);
    }
    
}
