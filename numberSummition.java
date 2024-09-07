package accenture_questions;

public class numberSummition {
    public static int numSummition(String str){
        int number1=0;
        String number2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==','){
                continue;
            }
            else if(numberSeperation(Character.getNumericValue(str.charAt(i)))){
                number1=number1+Character.getNumericValue(str.charAt(i));
            }
            else{
                number2=number2+str.charAt(i);
            }
        }
        return number1+Integer.valueOf(number2);

    }
    public static boolean numberSeperation(int n){
        if(n<4 || n>7){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="2,5,1,4,3,2,7,8";
        System.out.println(numSummition(str));
    }
}
