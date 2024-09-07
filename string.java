import java.util.Scanner;

public class string{
    public static void vowelsCounting(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The number of times vowels occured in String is : "+count);
    }
    public static void shortestPath(String s){
        int X=0,Y=0;
        int X1=0,Y1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'){
                X1=X1-1;
            }
            if(s.charAt(i)=='E'){
                X1=X1+1;
            }
            if(s.charAt(i)=='S'){
                Y1=Y1-1;
            }
            if(s.charAt(i)=='N'){
                Y1=X1+1;
            }
        }
        int n= (int) Math.pow(X-X1,2)+(int)Math.pow(Y-Y1,2);
        int sPath=(int)Math.sqrt(n);
        System.out.println(sPath);
    }
    public static boolean palindrome(String S){
        for(int i=0;i<S.length()/2;i++){
            if(S.charAt(i)==S.charAt(S.length()-1-i)){
                return true;
            }

            }
            return false;
        }
        public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String check;
//        check=new String();
//        check=sc.nextLine();
        //System.out.println(palindrome(check));
//            String path="WNEENESENNN";
//            shortestPath(path);
            String str="Hey I am Aqdas Firoz";
            vowelsCounting(str);
        }
    }
