import java.util.*;
public class factorialOfAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("You need factorial of");
        int a= sc.nextInt();
        do{
            if(a<=1){
                System.out.println("1");
                break;
            }
            else{
                fact=a*fact;
                a--;

            }
        }while(a!=1);
        System.out.println(fact);
    }
}
