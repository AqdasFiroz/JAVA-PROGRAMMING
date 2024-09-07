public class largestNumber {
    public static void largest(int a[]){
        int largest=0;
        int temp;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }


        }
        System.out.println(a[a.length-1]);
    }
    public static void main(String[] args){
        int a[]={12,23,66,22,11,4,6};
        largest(a);
    }
}
