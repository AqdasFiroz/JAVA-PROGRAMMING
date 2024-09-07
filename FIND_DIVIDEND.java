package accenture_questions;

public class FIND_DIVIDEND {
    public static int findDividend(int[] arr,int d,int q,int r){
        int dividend=d*q+r;
        int temp=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==dividend){
                temp=i;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr={12,24,9,35};
        System.out.println(findDividend(arr,8,3,0));
    }
}
