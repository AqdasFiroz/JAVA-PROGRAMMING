public class gcd {
    public static void main(String[] args) {
        int[] arr={3,8,14,12,10,7,4};
        System.out.println(arr);

    }
    public static int sum(int[] arr){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                sum1=sum1+arr[i];
            }
            else{
                sum2=sum2+arr[i];
            }
        }
        int value=sum1*sum2;
        return value;
    }
}