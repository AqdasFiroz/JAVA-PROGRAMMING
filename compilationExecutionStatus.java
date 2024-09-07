package accenture_questions;

public class compilationExecutionStatus {
    public static int status(int num){
        int sum=0;
        for(int i=1;i<11;i++){
            sum=sum+(num*i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(status(5));
        System.out.println(status(12));
    }
}
