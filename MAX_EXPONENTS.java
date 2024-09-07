package accenture_questions;

public class MAX_EXPONENTS {
    public static int maxExponent(int a,int b){
        int max=0;
        int maxE=0;
        for(int i=a;i<=b;i++){
            int count=0;
            if(i%2==0){
                int temp=i;
                while(temp%2==0){
                    temp=temp/2;
                    count++;
                }
                if(max<count){
                    max=count;
                    maxE=i;
                }
            }
        }
        return maxE;
    }

    public static void main(String[] args) {
        System.out.println(maxExponent(7,12));
    }
}
