import java.util.*;
public class bitManipulation {
    public static int countBits(int n){
        int count=0;
        while(n!=0){

            if((n & 1)!=0){
               count++;
            }
            n= (n>>1);
        }
        return count;
    }
    public static int  clearRangeOfBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=(a | b);
        return n & bitmask;
    }
    public static int clearLastIthBit(int n,int i){
        int bitmask=(~0<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i,int choice){
        int bitmask=(1<<i);
        if(choice==0){
            return n & ~bitmask;
        }
        return n|bitmask;

    }
    public static int clearIthBit(int n,int i){
        int ithBit=(n & ~(1<<i));
        return ithBit;
    }
    public static int setIthBit(int n,int i){
        int ithBit=(n | (1<<i));
        return ithBit;
    }
    public static void getIthBit(int n,int i){
        int ithBit=(n & (1<<i));
        if(ithBit==0) {
            System.out.println("The i'th bit is : 0");
        }
        else{
            System.out.println("The i'th bit is : 1 ");
        }
    }
    public static void oddOrEven(int n){
       int bitmask=1;
       if((n & bitmask)==0){
           System.out.println("Even");
       }
       else{
           System.out.println("Odd");
       }
    }
    public static int fastExponentiation(int a,int n){
         int ans=1;
         while(n>0){
             if((n&1)!=0){
                 ans=ans*a;
             }
             a=a*a;
             n=n>>1;
         }
         return ans;
    }

    public static void main(String[] args) {
        oddOrEven(38);
//        getIthBit(4,2);
//        setIthBit(10,2);
//        System.out.println(clearIthBit(10,1));
//        System.out.println(updateIthBit(10,2,1));
//        System.out.println(clearLastIthBit(15,2));
//        System.out.println(clearRangeOfBit(10,2,4));
 //         System.out.println(countBits(8));
        //System.out.println(fastExponentiation(3,5));
        //System.out.println(updateIthBit(14,2,0));
       // System.out.println(clearRangeOfBit(10,2,4));
        //int a=214748364799;
        //System.out.println(a);
    }
}
