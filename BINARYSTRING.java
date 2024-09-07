package accenture_questions;

public class BINARYSTRING {
    public static int binaryString(String str){
        if(str.length()==0){
            return -1;
        }
        int result=Character.getNumericValue(str.charAt(0));

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                int a=Character.getNumericValue(str.charAt(i+1));
                result=result & a;
            }
            if(str.charAt(i)=='B'){
                int a=Character.getNumericValue(str.charAt(i+1));
                result=result | a;
            }
            if(str.charAt(i)=='C'){
                int a=Character.getNumericValue(str.charAt(i+1));
                result=result ^ a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
        String str2="0C1A1B1C1C1B0A0";
        String str3="";
        System.out.println(binaryString(str));
        //System.out.println(str3.length());

    }
}
