package accenture_questions;

public class Decto_N_BASE {
    public static String dectoNBase(int num,int n){
        String symbols="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result=new StringBuilder();

        while(num>0){
            int rem=num%n;
            result.append(symbols.charAt(rem));
            num=num/n;
        }
        String nstr="";
        for(int i=0;i<result.length();i++){
            char ch= result.charAt(i);
            nstr=ch+nstr;
        }
        
        return nstr;
    }

    public static void main(String[] args) {
        System.out.println(dectoNBase(718,12));
        System.out.println(dectoNBase(5678,21));
    }
}
