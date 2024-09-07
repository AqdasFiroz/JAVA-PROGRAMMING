package accenture_questions;

public class sumOfNonPrimeDigits {
    public static int sum_oF_nonPrime_digits(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            if(!isPrime(rem)){
                sum=sum+rem;
            }
            num=num/10;
        }
        return sum;
    }
    public static boolean isPrime(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return false;
        }
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sum_oF_nonPrime_digits(45673));
    }
}
