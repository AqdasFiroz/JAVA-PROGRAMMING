package accenture_questions;

public class FLOYDD_PATTERN {
    public static void floydPattern(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floydPattern2(int N){
        int count=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydPattern2(4);
    }
}
