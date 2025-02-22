import java.util.*;

class Hashing{


    static int[] countFrequency(int[] arr,int n){

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

    static void countFrequencyUsingHashMap(int[]arr, int n){

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


        countFrequencyUsingHashMap(arr,sizeOfArray);

    }
}