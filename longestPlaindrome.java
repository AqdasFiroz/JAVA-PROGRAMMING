package accenture_questions;

public class longestPlaindrome {
    public static String longest_palindrome(String str){
        int max_len=0;
        int st=0;
        for(int i=0;i<str.length();i++){
            int l=i,r=i;
            while(l>=0&&r<str.length()){
                if(str.charAt(l)==str.charAt(r)){
                    l--;
                    r++;
                }
                else{
                    break;
                }
            }
            int len=r-l-1;
            if(max_len<len){
                max_len=len;
                st=l+1;
            }
        }
        for(int i=0;i<str.length();i++){
            int l=i,r=i+1;
            while(l>=0&&r<str.length()){
                if(str.charAt(l)==str.charAt(r)){
                    l--;
                    r++;
                }else{
                    break;
                }
            }
            int len=r-l-1;
            if(max_len<len){
                max_len=len;
                st=l+1;
            }
        }
        return str.substring(st,st+max_len);

    }

    public static void main(String[] args) {
        String str="abaccab";
        System.out.println(longest_palindrome(str));
        //System.out.println(str.substring(1,7));
    }
}