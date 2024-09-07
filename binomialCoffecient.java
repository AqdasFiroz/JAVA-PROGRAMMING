import javax.swing.*;

public class binomialCoffecient {
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The binomail coffecient of 5C3 is");
        int n=5;
        int r=3;
        int binC=(fact(n))/(fact(r)*fact(n-r));
        System.out.println(binC);
    }
}
