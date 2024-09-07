package accenture_questions;

public class PASSWORD_CHECKER {
    public static int password_checker(String str){
        if(str.length()<4){
            return 0;
        }
        if(isNumeric(str.charAt(0))){
            return 0;
        }
        int countN=0;
        int countC=0;

        for(int i=0;i<str.length();i++){
            if(isCapital(str.charAt(i))){
                countC++;
            }
            if(isNumeric(str.charAt(i))){
                countN++;
            }
            if(str.charAt(i)==' ' || str.charAt(i)=='/'){
                return 0;
            }
        }
        if(countC>=1 && countN>=1){
            return 1;
        }
        return 0;
    }
    public static boolean isNumeric(char N){
        return N>='0' && N<='9';
    }
    public static boolean isCapital(char N){
        return N>='A' && N<='Z';
    }

    public static void main(String[] args) {
        String str1="aA1_67";
        String str2="a987 abC012";
        String str3="Aqdas@123";
        String str4="abc";
        System.out.println(password_checker(str4));
    }
}
