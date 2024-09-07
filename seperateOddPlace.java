package accenture_questions;

public class seperateOddPlace {
    public static int seperateOddPlace(int n){
        String ans=String.valueOf(n);
        String opt="";
        for(int i=0;i<ans.length();i++){
            if(i%2==1){
                int y=Integer.parseInt(String.valueOf(ans.charAt(i)));
                opt=opt+y*y;
                if(opt.length()>=4){
                    break;
                }
            }
        }
        return Integer.parseInt(opt);
    }

    public static void main(String[] args) {
        System.out.println(seperateOddPlace(7564168));
    }
}
