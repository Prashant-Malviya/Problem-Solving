import java.util.*;

class Hashing{


    static int[] countFrequencyBruteForce(int[] arr,int n){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of queries you have:- ");

        int queries = sc.nextInt();

        int[] queriesAnswerArr = new int[queries];


        for(int i=0;i<queries;i++){
            
        System.out.println("Enter your query:- ");

        int query = sc.nextInt();

        int count = 0;

        for(int j=0;j<n;j++){

            if(query == arr[j]){
                count++;
            }
        }

        queriesAnswerArr[i] = count;

        System.out.println("The frequency of the given query is : "+count);
            
        }

        return queriesAnswerArr;
    }

import java.util.HashSet;

class FrequencyCounter {
    static void countFrequencyUsingHashArr(int[] arr, int n) {
        int[] hashArr = new int[50];

        // Build frequency array
        for (int i = 0; i < n; i++) {
            hashArr[arr[i]]++;
        }

        // Print frequency of unique elements only
        HashSet<Integer> printed = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!printed.contains(arr[i])) { 
                System.out.println(arr[i] + " -> " + hashArr[arr[i]]);
                printed.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 1, 4};
        countFrequencyUsingHashArr(arr, arr.length);
    }
}


    static void countFrequencyUsingHashMapOptimise(int[]arr, int n){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.print(map);
    }


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: - ");

        int sizeOfArray = sc.nextInt();

        int[] arr = new int[sizeOfArray];

        System.out.println("Enter the array elements:- ");

        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }

        // int[] frequencies = countFrequency(arr,sizeOfArray);

        // System.out.print("The result of queries is: ");
        // for(int e: frequencies){
        //     System.out.print(e +" ");
        // }


        // countFrequencyUsingHashMap(arr,sizeOfArray);


        countFrequencyUsingHashArr(arr,sizeOfArray);

    }
}