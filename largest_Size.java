package accenture_questions;

public class largest_Size {
    public static String largestSize(String str){
        String s="";
        String maxStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                if(maxStr.length()<s.length()){
                    maxStr=s;
                }
                s="";
            }
            else{
                s=s+str.charAt(i);
            }
        }
        if(maxStr.length()<s.length()){
            maxStr=s;
        }
        return maxStr;
    }

    public static void main(String[] args) {
        String str="hello.universe.from.aqdasFiroz";
        System.out.println(largestSize(str));
    }
}
