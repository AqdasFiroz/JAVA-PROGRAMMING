package accenture_questions;

public class countingSubString {
    public static int countingSubString(String str,String sstr){
        int count=0;
        for(int i=0;i<=str.length()-sstr.length();i++){
            if(sstr.equals(str.substring(i,i+sstr.length()))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countingSubString("ABCDCDC","CDC"));
    }
}
