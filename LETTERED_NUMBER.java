package accenture_questions;



public class LETTERED_NUMBER {
    public static int valueOf(char c) {
        switch (c) {
            case 'A': return 1;
            case 'B': return 10;
            case 'C': return 100;
            case 'D': return 1000;
            case 'E': return 10000;
            case 'F': return 100000;
            case 'G': return 1000000;
            default: return 0; // If the character is not recognized, return 0
        }
    }
    public static int lettered_number(char[] str){
        int sum=0;
        for(int i=0;i<str.length;i++){
            sum=sum+valueOf(str[i]);
            //System.out.println("_____________________");
            //System.out.println(sum);

        }
        return sum;
    }

    public static void main(String[] args) {
         char[] str={'D','C','C','B','A','A',};
        System.out.println(lettered_number(str));
    }

}
