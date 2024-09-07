public class stringCompression {
    public static String compression2(String str){
        StringBuilder sb=new StringBuilder();
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr=newStr+str.charAt(i);
            if(count>1){
                newStr=newStr+count.toString();
            }
        }
        return newStr;
    }
    public static void compression(String str){

        for(int i=0;i<str.length()-1;i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            if(count!=1 && count!=0){
                System.out.print(str.charAt(i)+""+count);
            }
            else{
                System.out.print(str.charAt(i));
            }
            //System.out.print(str.charAt(i)+""+count);
        }
    }

    public static void main(String[] args) {
        String str="aaabbbccccdddeff";
        System.out.println(compression2(str));
    }
}