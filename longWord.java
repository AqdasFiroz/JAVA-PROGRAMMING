package accenture_questions;

public class longWord {
    public static String longWord(String str){
        String st=str.charAt(0)+Integer.toString(str.length()-2)+str.charAt(str.length()-1);
        return st;
    }

    public static void main(String[] args) {
        System.out.println(longWord("Localization"));
        System.out.println(longWord("internationalization"));
    }
}
