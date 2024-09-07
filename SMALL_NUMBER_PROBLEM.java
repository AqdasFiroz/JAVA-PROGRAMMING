package accenture_questions;

public class SMALL_NUMBER_PROBLEM {
    public static int[] small_number_problem(int[] arr){
        int[] arr1=new int[arr.length];
        if(arr.length==0){
            return null;
        }
        for(int i=0;i<arr.length;i++) {
            arr1[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr1[i] = arr[j];
                    break;
                }

            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 11, 7, 6, 5, 6, 1};
        int[] arr1={10,5,4,5,3,2,1};
        int[] store=small_number_problem(arr1);
        for (int i = 0; i < store.length; i++) {
           System.out.println(store[i]);
        }
    }
}
