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

    static void pairSumInSingleArray(int[] arr){
        int sum = 0;

        for(int i=0;i<arr.length;i++){

            for(int j = i+1; j<arr.length;j++){

                sum += arr[i] + arr[j];
            }
        }

        System.out.println("the pair sum in single array is "+sum);
    }


    static void maxPairSumInSingleArray(int[] arr){
        int sum = 0, maxPairSum = 0;


        for(int i=0;i<arr.length;i++){

            for(int j = i+1; j<arr.length;j++){

                sum += arr[i] + arr[j];

                maxPairSum = Math.max(maxPairSum,sum);
                System.out.println("max pair sum for "+i + " and "+j + " is = "+ maxPairSum);
            }
        }

        System.out.println("the max pair sum in single array is "+maxPairSum);
    }


    static void tripletSum(int[] arr){

        for(int i=0;i<arr.length-2;i++){

            for(int j=i+1;j<arr.length-1;j++){

                for(int k=j+1; k<arr.length;k++){

                    int sum = arr[i] + arr[j] + arr[k];

                    System.out.println("The triplet sum for i = "+i+ " j = "+j+" "+" k = "+k+" , the sume is sum = "+sum);
                }
            }
        }
    }

    // count of odd and even triplet sum

    static void oddAndEvenTripletSumCount(int[] arr){

        int evenSumCount = 0, oddSumCount = 0;

        for(int i=0;i<arr.length-2;i++){

            for(int j=i+1;j<arr.length-1;j++){

                for(int k=j+1; k<arr.length;k++){

                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum % 2 == 0){
                        evenSumCount++;
                    }else{
                        oddSumCount++;
                    }

                    System.out.println("The triplet sum for i = "+i+ " j = "+j+" "+" k = "+k+" , the sume is sum = "+sum);

                }
            }
        }
        System.out.println("The even sum count is "+ evenSumCount + " odd sum count is "+ oddSumCount);
    }


    // count of distinct elements

    static void distinctElementCount(int[] arr){

        boolean[] visited = new boolean[101];

        int count = 0;

        for(int i = 0; i<arr.length; i++){

            if(visited[arr[i]] == false){
                count++;
                visited[arr[i]] = true;
            }
        }

        System.out.println("the distinct elements are "+count);
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

        // sumOfEvenIdxAndOddIdx(arr);

        // pairSumInSingleArray(arr);

        // maxPairSumInSingleArray(arr);

        // tripletSum(arr);

        // oddAndEvenTripletSumCount(arr);

        distinctElementCount(arr);
    }
    
}
