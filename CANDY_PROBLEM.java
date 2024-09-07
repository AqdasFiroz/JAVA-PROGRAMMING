package accenture_questions;

import java.util.Arrays;

public class CANDY_PROBLEM {
    public static int candyProblem(int[] arr,int m){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                count++;
            }
            else{
               if(m-arr[i]>0){
                   m=m-arr[i];
                   count++;
               }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1={5,15,105};
        int[] arr2={5,4,15,6};
        int[] arr3={5,2,8,3,10,3,15};
        System.out.println(candyProblem(arr1,8));
        System.out.println(candyProblem(arr2,5));
        System.out.println(candyProblem(arr3,8));
    }
}
