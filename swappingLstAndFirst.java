package accenture_questions;

public class swappingLstAndFirst {
    public static int[] swappingFirstLast(int[] arr){
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={12,25,13,26,27,24};
        int[] store=swappingFirstLast(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(store[i]);
        }

    }
}
