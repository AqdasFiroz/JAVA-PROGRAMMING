package accenture_questions;

public class differenceOfSum {
    public static int difference_of_sum(int n,int m){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%4==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum2+i;
            }
        }
        return sum2-sum1;
    }

    public static void main(String[] args) {
        System.out.println(difference_of_sum(4,20));
    }
}
