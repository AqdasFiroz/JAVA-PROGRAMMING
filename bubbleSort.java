public class bubbleSort {
    public static void bubbleSort(int a[]){
        int temp;
        int isSorted=1;
        for(int i=0;i<a.length-1;i++){
            System.out.println("Number of passes \n");
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSorted=0;
                }

            }
            if(isSorted==1){
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,6,3,9,7,2,5};
        int arr1[]={1,2,3,4,5,6,7,8};
        bubbleSort(arr1);
    }
}
