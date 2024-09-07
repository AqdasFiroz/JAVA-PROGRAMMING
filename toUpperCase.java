public class toUpperCase {
    public static void upperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(" ");
                i++;
                char chc=Character.toUpperCase(str.charAt(i));
                sb.append(chc);
            }
            else{
                char chc1=(str.charAt(i));
                sb.append(chc1);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="hey, i am aqdas firoz.";
        upperCase(str);
    }
}
