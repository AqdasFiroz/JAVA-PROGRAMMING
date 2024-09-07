package accenture_questions;

public class permutationFormed {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int permutationFormed(String str){
        String vowels="aeiou";
        String s="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(vowels.indexOf(c)==-1){
                s=s+c;
            }
        }
        int count=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count=count+1;
                }
            }
        }
        return factorial(s.length()-1)/factorial(count);
    }

    public static void main(String[] args) {
        System.out.println(permutationFormed("abbced"));
    }
}
