package accenture_questions;

public class replaceChar {
    public static String replaceChar(String str){
        String s="";
        int count=1;
        s=s+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(count%3==0){
                s=s+'#';
                count++;
                count=count%3;
            }else{
                s=s+str.charAt(i);
                count++;
                count=count%3;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("welcome to python coding"));
    }
}
