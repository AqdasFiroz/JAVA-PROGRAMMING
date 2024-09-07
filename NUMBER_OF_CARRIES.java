package accenture_questions;

public class NUMBER_OF_CARRIES {
    public static int numberOfCarries(int num1,int num2){
        int carry=0,rem1,rem2,sum,count=0;
        while(num1>0 || num2>0){
            rem1=num1%10;
            rem2=num2%10;
            sum=carry+rem1+rem2;
            if(sum>9){
                carry=1;
                count++;
            }
            else{
                carry=0;
            }
            num1=num1/10;
            num2=num2/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfCarries(451,349));
        System.out.println(numberOfCarries(23,563));
        System.out.println(numberOfCarries(999,999));
    }
}
