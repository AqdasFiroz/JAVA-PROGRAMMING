package accenture_questions;

public class product_smallest_pair {
    public static int productSmallestPair(int[] arr,int sum){
        int min=Integer.MAX_VALUE;
        int t1=0;
        int t2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<=sum){
                    if(arr[i]+arr[j]<min) {
                        min = arr[i] + arr[j];
                        t1 = arr[i];
                        t2 = arr[j];
                    }
                }
            }
        }

        return t1*t2;
    }

    public static void main(String[] args) {
        int[] arr1={5 ,2 ,4 ,3 ,9 ,7 ,1};
        int[] arr2={9 ,8 ,3 ,-7 ,3 ,9};
        System.out.println(productSmallestPair(arr1,9));
        System.out.println(productSmallestPair(arr2,4));
    }
}
