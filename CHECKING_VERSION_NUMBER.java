package accenture_questions;

public class CHECKING_VERSION_NUMBER {
    public static int checking_version_number(String[] str){
        int maxVersion=0;
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=6){
                if(str[i].substring(0,5).equals("File_")){
                    if(checking(str[i].substring(6,str[i].length()))){
                        int version=Integer.valueOf(str[i].substring(5,str[i].length()));
                        if(maxVersion<version){
                            maxVersion=version;
                        }
                    }
                }
            }
        }
        return maxVersion;
    }
    public static boolean checking(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] str={"File_10","File_File","File_19"};
        System.out.println(checking_version_number(str));
    }

}
