package accenture_questions;

public class cakePieces {
    public static int cake_pieces(int N){
        if(N==1){
            return 2;
        }
        return N+cake_pieces(N-1);
    }

    public static void main(String[] args) {
        System.out.println(cake_pieces(4));
    }
}
