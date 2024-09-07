import java.util.*;
public class numberChekcing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check");
        int number= sc.nextInt();;
        if(number<0){
            System.out.println("The numberf is negavtive");
        }
        else{
            System.out.println("Number is positive");
        }

    }
}
