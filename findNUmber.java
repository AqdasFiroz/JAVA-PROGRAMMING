package accenture_questions;

public class findNUmber {
    public static int fineNumber(int[] arr1,int[] arr2){
        int min1=Integer.MAX_VALUE;
        int max1=0;
        int min2=Integer.MAX_VALUE;
        int max2=0;
        for(int i=0;i<arr1.length;i++){
            if(min1>arr1[i]){
                min1=arr1[i];
            }
            if(max1<arr1[i]){
                max1=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(min2>arr2[i]){
                min2=arr2[i];
            }
            if(max2<arr2[i]){
                max2=arr2[i];
            }
        }
        int min=Integer.min(min1,min2);
        int max=Integer.max(max1,max2);
        return max-min;

    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={10,12,34,2,4,89};
        int[] arr3={6,7,8,11};
        int[] arr4={3,1,2};
        System.out.println(fineNumber(arr3,arr4));
    }
}
