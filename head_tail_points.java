package accenture_questions;

public class head_tail_points {
    public static int headTailsPoinnts(String str){
        int point=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='H'){
                point=point+2;
                count++;
                if(count==3){
                    return point;
                }
            }
            else{
                point=point-1;
                count=0;
            }
        }
        return point;
    }

    public static void main(String[] args) {
        String str="HTHHTTHTHHHT";
        String str2="TTTHHTT";
        System.out.println(headTailsPoinnts(str));
        System.out.println(headTailsPoinnts(str2));
    }
}
