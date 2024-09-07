package accenture_questions;

public class sumOfDigits {
    public static int diffSumOfDigits(int[] arr) {
        int f1=0;
        int f2=0;
        for(int i=0;i<arr.length;i++){
            f1=f1+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            while(temp!=0){
                int remainder=temp%10;
                f2=f2+remainder;
                temp=temp/10;
            }
        }
        f2=f2%10;
        f1=f1%10;
        return f2-f1;
    }

    public static void main(String[] args) {
        int[] arr={11,14,16,10,9,8,24,5,4,3};
        System.out.println(diffSumOfDigits(arr));
    }
}
