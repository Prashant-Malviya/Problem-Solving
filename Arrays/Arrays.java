package Arrays;

import java.util.*;

public class Arrays {

    static void sumAndMultiplication(int[] arr) {
        int sum = 0;
        int multiplication = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            multiplication *= arr[i];
        }

        System.out.println("sum is = " + sum + "and multiplication is " + multiplication);

    }

    static void sumOfEvenAndOddNumber(int[] arr) {
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("even sum is " + evenSum + " and odd sum is " + oddSum);
    }

    static void sumOfEvenIdxAndOddIdx(int[] arr) {
        int evenIdxSum = 0, oddIdxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIdxSum += arr[i];
            } else {
                oddIdxSum += arr[i];
            }
        }

        System.out.println("even idx sum is " + evenIdxSum + " odd idx sum is " + oddIdxSum);
    }

    static void pairSumInSingleArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                sum += arr[i] + arr[j];
            }
        }

        System.out.println("the pair sum in single array is " + sum);
    }

    static void maxPairSumInSingleArray(int[] arr) {
        int sum = 0, maxPairSum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                sum += arr[i] + arr[j];

                maxPairSum = Math.max(maxPairSum, sum);
                System.out.println("max pair sum for " + i + " and " + j + " is = " + maxPairSum);
            }
        }

        System.out.println("the max pair sum in single array is " + maxPairSum);
    }

    static void tripletSum(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    System.out.println("The triplet sum for i = " + i + " j = " + j + " " + " k = " + k
                            + " , the sume is sum = " + sum);
                }
            }
        }
    }

    // count of odd and even triplet sum

    static void oddAndEvenTripletSumCount(int[] arr) {

        int evenSumCount = 0, oddSumCount = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum % 2 == 0) {
                        evenSumCount++;
                    } else {
                        oddSumCount++;
                    }

                    System.out.println("The triplet sum for i = " + i + " j = " + j + " " + " k = " + k
                            + " , the sume is sum = " + sum);

                }
            }
        }
        System.out.println("The even sum count is " + evenSumCount + " odd sum count is " + oddSumCount);
    }

    // count of distinct elements

    static void distinctElementCount(int[] arr) {

        boolean[] visited = new boolean[101];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (visited[arr[i]] == false) {
                count++;
                visited[arr[i]] = true;
            }
        }

        System.out.println("the distinct elements are " + count);
    }

    // print prime numbers between range

    static void printPrimeNumbers() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the range of number");

        int range = sc.nextInt();

        System.out.print("Prime Numbers Are: ");

        for (int i = 1; i <= range; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }

    // Reverse numbers sum between range

    static int reverseNumber(int number) {

        int reverse = 0;

        while (number > 0) {
            int remainder = number % 10;

            reverse = reverse * 10 + remainder;

            number /= 10;
        }

        return reverse;
    }

    static void reverseNumbersSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range for which you want to find the reverse sum: ");

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            int number = i;
            int reverseNumber = reverseNumber(number);

            sum += reverseNumber;
        }

        System.out.println("The sum of reverse numbers is : " + sum);

    }

    // First and last index of a target element

    static int[] firstAndLastIdx(int[] arr, int target) {
        int firstIdx = 0, lastIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstIdx = i;
                break;
            }
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == target) {
                lastIdx = j;
                break;
            }
        }

        return new int[] { firstIdx, lastIdx };
    }

    // Count frequency of each element

    static void frequencyCounter(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i] == false) {
                visited[i] = true;
                int count = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }

                System.out.println(arr[i] + " -> " + count);
            }
        }

    }

    // 2D array

    static void twoDArray(int[][] arr) {

        int rows = arr.length, cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size of the array: ");
        // int size = sc.nextInt();

        // System.out.println("Enter Arr Elements: ");

        // int[] arr = new int[size];

        // for(int i=0;i<size;i++){
        // arr[i] = sc.nextInt();
        // }

        // System.out.println("Here is the array elements: ");

        // for(int e: arr){
        // System.out.println(e);
        // }

        // sumAndMultiplication(arr);

        // sumOfEvenAndOddNumber(arr);

        // sumOfEvenIdxAndOddIdx(arr);

        // pairSumInSingleArray(arr);

        // maxPairSumInSingleArray(arr);

        // tripletSum(arr);

        // oddAndEvenTripletSumCount(arr);

        // distinctElementCount(arr);

        // printPrimeNumbers();

        // reverseNumbersSum();

        // int[] result = firstAndLastIdx(new int[]{1,3,2,2,2,0}, 2);

        // System.out.println("the first and last idx is "+result[0]+" "+result[1]);

        // frequencyCounter(new int[] { 1, 2, 3, 2, 1, 2, 1, 3, 53, 2, 1, 2, 2, 3, 4 });

        twoDArray(new int[][]{{1,2,3,4},{5,6,7,8},{9,8,7,6}});
    }

}
