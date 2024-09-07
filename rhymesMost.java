package accenture_questions;

public class rhymesMost {
    public static String rhymesMost(String word,String[] str){
        int msl=0;
        String ans="";
        for(String input:str){
            int csl=longestSuffixLength(word,input);
            if(msl<csl || msl==csl && input.length()<ans.length()  ){
                ans=input;
                msl=csl;
            }
        }
        return ans;
    }
    public static int longestSuffixLength(String word,String input){
        int len=Math.max(word.length(),input.length());
        int x=word.length()-1;
        int y=input.length()-1;
        int count=0;
        while(x>=0 && y>=0 && word.charAt(x)==input.charAt(y)){
            x--;
            y--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr={"gender","blunder","blender","under"};
        System.out.println(rhymesMost("thunder",arr));
    }
}
