public class selectionSort {
    public static void swap(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                temp = a[j];
                a[j] = a[ + 1];
                a[j + 1] = temp;
            }
        }

    }

    public static void selection(int a[]) {

        for (int i = 0; i < a.length-1; i++) {
            int minpos=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[minpos] > a[j]) {
                    minpos=j;
                }

            }
            int temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,6,3,9,7,2,5};
        selection(arr);
    }
}
