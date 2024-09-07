package accenture_questions;

public class putOinPlace {
    public static String putOinPlace(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s=s+'o';
            }
            else if(str.charAt(i)==')'){
                s=s;
            }
            else{
                s=s+str.charAt(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(putOinPlace("go()()()al"));
    }
}
