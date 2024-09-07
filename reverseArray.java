public class reverseArray {
    public static void reverse(int a[]){
        int temp;
        for(int i=0;i<a.length/2;i++){
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12};
        reverse(a);
    }
}
