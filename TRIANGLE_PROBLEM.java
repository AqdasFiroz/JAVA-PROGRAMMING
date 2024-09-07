package accenture_questions;

public class TRIANGLE_PROBLEM {
    public static int triangleProblem(int a,int b){
        return (int)Math.ceil(Math.sqrt(a*a+b*b));
    }

    public static void main(String[] args) {
        System.out.println(triangleProblem(3,2));
        System.out.println(triangleProblem(5,12));
    }
}
