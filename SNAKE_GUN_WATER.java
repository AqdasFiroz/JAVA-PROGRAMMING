package accenture_questions;

public class SNAKE_GUN_WATER {
    public static int snakeGunWater(String str){
        String A="";
        String B="";
        int count=0;
        String word="";
        for(int i=0;i<str.length();i++){
            word=word+str.charAt(i);
            if((word.equals("snake") || word.equals("gun") || word.equals("water") )&& count%2==0){
                A=A+word.charAt(0);
                word="";
                count++;
            }
            if((word.equals("snake") || word.equals("gun") || word.equals("water") )&& count%2!=0){
                B=B+word.charAt(0);
                word="";
                count++;
            }
        }
        int winA=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='w' && B.charAt(i)=='g'){
                winA++;
            }
            if(A.charAt(i)=='s' && B.charAt(i)=='w'){
                winA++;
            }
            if(A.charAt(i)=='g' && B.charAt(i)=='s'){
                winA++;
            }
        }
        return winA;
    }

    public static void main(String[] args) {
        String str="snakewatergunwater";
        System.out.println(snakeGunWater(str));
    }
}
