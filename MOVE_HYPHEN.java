package accenture_questions;

public class MOVE_HYPHEN {
    public static String moveHyphe(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                char ch=str.charAt(i);
                newStr=ch+newStr;
            }
            else{
                newStr=newStr+str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str="Move-Hyphens-to-Front";
        String str1="String-Compare";
        System.out.println(moveHyphe(str));
        System.out.println(moveHyphe(str1));
    }
}
