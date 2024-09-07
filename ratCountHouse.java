package accenture_questions;

public class ratCountHouse {
    public static int ratHouse(int[] arr,int r,int u){
        if(arr==null){
            return -1;
        }
        int amount=0;
        for(int i=0;i<arr.length;i++){
            if(amount<(r*u)){
                amount=amount+arr[i];
                if(amount>=(r*u)){
                    return (i+1);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={2,8,3,5,7,4,1,2};
        System.out.println(ratHouse(arr,7,2));
    }
}
