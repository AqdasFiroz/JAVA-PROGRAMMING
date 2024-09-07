package accenture_questions;

public class OPERATION_CHOICES {
    public static int operationChoices(int c,int a,int b){
        switch(c){
            case 1:
                return a+b;

            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(operationChoices(1,12,16));
        System.out.println(operationChoices(2,16,20));
    }
}
