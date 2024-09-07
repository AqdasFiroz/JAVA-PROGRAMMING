package accenture_questions;

public class evenOddMatrix {
    public static int even_odd_matriz(int[] arr){
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        if (arr[i] > arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                else {
                    if (j % 2 != 0) {
                        if (arr[i] > arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
        int EmaxS=0;
        int OmaxS=0;
        if(arr.length%2==1){
            EmaxS=arr[arr.length-3];
            OmaxS=arr[arr.length-4];
        }
        if(arr.length%2==0){
            EmaxS=arr[arr.length-4];
            OmaxS=arr[arr.length-3];
        }
        return EmaxS+OmaxS;
    }

    public static void main(String[] args) {
        int[] arr={3,4,1,7,9,11};
        System.out.println(even_odd_matriz(arr));
    }
}
