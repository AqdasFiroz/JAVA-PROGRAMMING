package accenture_questions;

public class sumPrimeINDICES {
    public static int sumPrimeIndices(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(i)){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        int count=0;
        if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={10,-12,2,5,3,15,17,21,-3,-4};
        int[] arr1={-1,2,-3,55,51,34,5,-4,66,8,63,45};
        System.out.println(sumPrimeIndices(arr));
        System.out.println(sumPrimeIndices(arr1));
    }
}
