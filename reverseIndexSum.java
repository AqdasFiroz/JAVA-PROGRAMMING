package accenture_questions;

public class reverseIndexSum {
    public static int reverseIndexSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int ridx=arr.length-i-1;
            if(ridx%2==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,0,1,2,3};
        System.out.println(reverseIndexSum(arr));
    }
}
