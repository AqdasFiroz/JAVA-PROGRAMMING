package accenture_questions;

public class replaceCharacter {
    public static String replace_character(String str,char ch1,char ch2){
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                newStr=newStr+ch2;
            }
            else if(str.charAt(i)==ch2){
                newStr=newStr+ch1;
            }
            else{
                newStr=newStr+str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str="apples";
        System.out.println(replace_character(str,'a','p'));
    }
}
